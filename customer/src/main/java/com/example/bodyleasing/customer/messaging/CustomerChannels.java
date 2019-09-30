package com.example.bodyleasing.customer.messaging;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.SubscribableChannel;

public interface CustomerChannels {
    String TimesheetEntered = "timesheetEnteredIn";

    @Input
    SubscribableChannel timesheetEnteredIn();
}
