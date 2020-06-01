package com.example.bodyleasing.customer.application;

import com.example.bodyleasing.commontypes.CustomerId;
import com.example.bodyleasing.customer.domain.customer.service.CustomerService;
import com.example.bodyleasing.customer.events.incoming.TimesheetEnteredEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerApplicationService {

    @Autowired
    private CustomerService customerService;

    public void getProjectsForCustomer(CustomerId customerId) {

    }

    public void deleteCustomerById(Long customId) {

    }

    public void timesheetEnterd(TimesheetEnteredEvent timesheetEnteredEvent) {
        customerService.timesheetEnterd(timesheetEnteredEvent);
    }
}
