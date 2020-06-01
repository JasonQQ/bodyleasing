package com.example.bodyleasing.freelancer.web;

import com.example.bodyleasing.commontypes.FreelancerId;
import com.example.bodyleasing.freelancer.domain.FreelancerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FreelancerController {

    @Autowired
    private FreelancerService freelancerService;

    @PostMapping(path = "/freelancers/{freelancerId}/timesheet")
    public void timesheet(@PathVariable String freelancerId) {
        FreelancerId freelancerId1 = new FreelancerId();
        freelancerId1.setUniqueId(freelancerId);
        freelancerService.addTimesheet(freelancerId1);
    }
}
