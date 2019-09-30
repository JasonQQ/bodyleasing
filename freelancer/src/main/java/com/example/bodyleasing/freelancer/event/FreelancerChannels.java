package com.example.bodyleasing.freelancer.event;

import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;

public interface FreelancerChannels {

    @Output
    MessageChannel timesheetEnteredOut();
}
