package com.example.bodyleasing.freelancer;

import com.example.bodyleasing.freelancer.event.FreelancerChannels;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;

@SpringBootApplication
@EnableBinding(FreelancerChannels.class)
public class FreelancerApplication {

    public static void main(String[] args) {
        SpringApplication.run(FreelancerApplication.class, args);
    }

}
