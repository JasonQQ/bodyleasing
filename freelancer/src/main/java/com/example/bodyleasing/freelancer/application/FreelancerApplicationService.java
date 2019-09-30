package com.example.bodyleasing.freelancer.application;

import com.example.bodyleasing.freelancer.domain.Address;
import com.example.bodyleasing.freelancer.domain.Freelancer;
import org.springframework.beans.factory.annotation.Autowired;

public class FreelancerApplicationService {

    private Freelancer freelancer;

    @Autowired
    public FreelancerApplicationService(Freelancer freelancer) {
        this.freelancer = freelancer;
    }

    public void freelancerMoved(Address address) {
        freelancer.movedTo(address);
    }
}
