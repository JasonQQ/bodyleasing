package com.example.bodyleasing.freelancer.web;

import com.example.bodyleasing.freelancer.domain.FreelancerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FreelancerController {

    @Autowired
    private FreelancerService freelancerService;

    @PostMapping(path = "/")
    public void timesheet() {
        freelancerService.addTimesheet();
    }
}
