package com.example.bodyleasing.freelancer.domain;

import com.example.bodyleasing.commontypes.FreelancerId;
import com.example.bodyleasing.freelancer.event.FreelancerChannels;
import com.example.bodyleasing.freelancer.event.TimesheetEnteredEvent;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;

import java.util.Date;

@Log4j2
@Service
public class FreelancerService {

    private FreelancerChannels freelancerChannels;

    @Autowired
    public FreelancerService(FreelancerChannels freelancerChannels) {
        this.freelancerChannels = freelancerChannels;
    }

    public void addTimesheet(FreelancerId freelancerId) {
        log.info("addTimesheet");
        TimesheetEnteredEvent timesheetEnteredEvent = new TimesheetEnteredEvent();
        timesheetEnteredEvent.setTimestamp(new Date());
        freelancerChannels.timesheetEnteredOut().send(MessageBuilder.withPayload(timesheetEnteredEvent).build());
        log.info("event sent");
    }
}
