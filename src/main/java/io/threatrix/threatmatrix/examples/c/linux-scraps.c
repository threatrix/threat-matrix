MODULE_AUTHOR("Charles Eidsness <charles@cooper-street.com>");
MODULE_DESCRIPTION("Au1000 AC'97 ALSA Driver");
MODULE_LICENSE("GPL");
MODULE_SUPPORTED_DEVICE("{{AMD,Au1000 AC'97}}");

#define PLAYBACK 0
#define CAPTURE 1
#define AC97_SLOT_3 0x01
#define AC97_SLOT_4 0x02
#define AC97_SLOT_6 0x08

/* https://github.com/torvalds/linux/blob/v2.6.19/sound/mips/au1x00.c */
static int
au1000_setup_dma_link(struct audio_stream *stream, unsigned int period_bytes,
		      unsigned int periods)
{
	struct snd_pcm_substream *substream = stream->substream;
	struct snd_pcm_runtime *runtime = substream->runtime;
	struct au1000_period *pointer;
	unsigned long dma_start;
	int i;

	dma_start = virt_to_phys(runtime->dma_area);

	if (stream->period_size == period_bytes &&
	    stream->periods == periods)
		return 0; /* not changed */

	au1000_release_dma_link(stream);

	stream->period_size = period_bytes;
	stream->periods = periods;

	stream->buffer = kmalloc(sizeof(struct au1000_period), GFP_KERNEL);
	if (! stream->buffer)
		return -ENOMEM;
	pointer = stream->buffer;
	for (i = 0; i < periods; i++) {
		pointer->start = (u32)(dma_start + (i * period_bytes));
		pointer->relative_end = (u32) (((i+1) * period_bytes) - 0x1);
		if (i < periods - 1) {
			pointer->next = kmalloc(sizeof(struct au1000_period), GFP_KERNEL);
			if (! pointer->next) {
				au1000_release_dma_link(stream);
				return -ENOMEM;
			}
			pointer = pointer->next;
		}
	}
	pointer->next = stream->buffer;
	return 0;
}

/* https://github.com/torvalds/linux/blob/v5.16/sound/mips/snd-n64.c */
static void n64audio_push(struct n64audio *priv)
{
	struct snd_pcm_runtime *runtime = priv->chan.substream->runtime;
	unsigned long flags;
	u32 count;

	spin_lock_irqsave(&priv->chan.lock, flags);

	count = priv->chan.writesize;

	memcpy(priv->ring_base + priv->chan.nextpos,
	       runtime->dma_area + priv->chan.nextpos, count);

	/*
	 * The hw registers are double-buffered, and the IRQ fires essentially
	 * one period behind. The core only allows one period's distance, so we
	 * keep a private DMA buffer to afford two.
	 */
	n64audio_write_reg(priv, AI_ADDR_REG, priv->ring_base_dma + priv->chan.nextpos);
	barrier();
	n64audio_write_reg(priv, AI_LEN_REG, count);

	priv->chan.nextpos += count;
	priv->chan.nextpos %= priv->chan.bufsize;

	runtime->delay = runtime->period_size;

	spin_unlock_irqrestore(&priv->chan.lock, flags);
}

