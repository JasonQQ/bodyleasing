package com.example.bodyleasing.customer.domain.customer.service;

import com.example.bodyleasing.commontypes.CustomerId;
import com.example.bodyleasing.customer.domain.customer.Customer;
import com.example.bodyleasing.customer.domain.customer.adapter.ProjectManagementAdapter;
import com.example.bodyleasing.customer.domain.customer.repository.CustomerRepository;
import com.example.bodyleasing.customer.events.incoming.TimesheetEnteredEvent;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Log4j2
@Service
public class CustomerService {

    @Autowired
    private ProjectManagementAdapter projectManagementAdapter;
    @Autowired
    private CustomerRepository customerRepository;

    public Customer findCustomerById(CustomerId customerId) {
        return customerRepository.findByCustomerId(customerId);
    }

    public void deleteCustomerById(CustomerId customerId) {
        if (!projectManagementAdapter.projectExistsForCustomer(customerId)) {
            customerRepository.removeByCustomerId(customerId);
        }
    }

    public void timesheetEnterd(TimesheetEnteredEvent timesheetEnteredEvent) {
        log.info("timesheetEnterd");
    }
}
