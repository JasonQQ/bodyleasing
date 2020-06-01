package com.example.bodyleasing.customer.web;

import com.example.bodyleasing.commontypes.CustomerId;
import com.example.bodyleasing.customer.application.CustomerApplicationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {

    @Autowired
    private CustomerApplicationService customerApplicationService;

    @GetMapping(path = "/customers/{customerId}/projects")
    public void getProjects(@PathVariable String customerId) {
        CustomerId aCustomerId = new CustomerId();
        aCustomerId.setUniqueId(customerId);
        customerApplicationService.getProjectsForCustomer(aCustomerId);
    }
}
