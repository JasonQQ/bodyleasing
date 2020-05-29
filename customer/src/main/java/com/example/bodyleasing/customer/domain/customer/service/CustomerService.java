package com.example.bodyleasing.customer.domain.customer.service;

import com.example.bodyleasing.customer.events.incoming.TimesheetEnteredEvent;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

@Log4j2
@Service
public class CustomerService {

    public void timesheetEnterd(TimesheetEnteredEvent timesheetEnteredEvent) {
        log.info("timesheetEnterd");
    }
}
