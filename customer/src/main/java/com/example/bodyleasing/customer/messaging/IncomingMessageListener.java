package com.example.bodyleasing.customer.messaging;

import com.example.bodyleasing.customer.application.CustomerApplicationService;
import com.example.bodyleasing.customer.events.incoming.TimesheetEnteredEvent;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

@Log4j2
@Component
public class IncomingMessageListener {

    @Autowired
    CustomerApplicationService customerApplicationService;

    @StreamListener(CustomerChannels.TimesheetEntered)
    public void receiveTimesheetEntered(@Payload TimesheetEnteredEvent timesheetEnteredEvent) {
        log.info("received timesheetEnteredEvent");
        customerApplicationService.timesheetEnterd(timesheetEnteredEvent);
    }
}
