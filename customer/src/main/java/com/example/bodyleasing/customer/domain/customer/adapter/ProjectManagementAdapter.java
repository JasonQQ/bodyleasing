package com.example.bodyleasing.customer.domain.customer.adapter;

import com.example.bodyleasing.commontypes.CustomerId;
import org.springframework.stereotype.Service;

@Service
public class ProjectManagementAdapter {

    public boolean projectExistsForCustomer(CustomerId customerId) {
        return true;
    }
}
