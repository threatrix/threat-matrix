void CoreBase::setCallback_(
    Callback&& callback,
    std::shared_ptr<folly::RequestContext>&& context,
    futures::detail::InlineContinuation allowInline) {
  DCHECK(!hasCallback());

  ::new (&callback_) Callback(std::move(callback));
  ::new (&context_) Context(std::move(context));

  auto state = state_.load(std::memory_order_acquire);
  State nextState = allowInline == futures::detail::InlineContinuation::permit
      ? State::OnlyCallbackAllowInline
      : State::OnlyCallback;

  if (state == State::Start) {
    if (folly::atomic_compare_exchange_strong_explicit(
            &state_,
            &state,
            nextState,
            std::memory_order_release,
            std::memory_order_acquire)) {
      return;
    }
    assume(state == State::OnlyResult || state == State::Proxy);
  }
