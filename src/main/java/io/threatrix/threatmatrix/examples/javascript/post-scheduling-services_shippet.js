const publishedAtMoment = moment(preScheduledResource.published_at);

        if (publishedAtMoment.diff(moment(), 'minutes') > publishAPostBySchedulerToleranceInMinutes) {
            return Promise.reject(new errors.NotFoundError({message: messages.jobNotFound}));
        }

        if (publishedAtMoment.diff(moment(), 'minutes') < publishAPostBySchedulerToleranceInMinutes * -1 && force !== true) {
            return Promise.reject(new errors.NotFoundError({message: messages.jobPublishInThePast}));
        }

        const editedResource = {};
        editedResource[resourceType] = [{
            status: 'published',
            updated_at: moment(preScheduledResource.updated_at).toISOString(true)
        }];
