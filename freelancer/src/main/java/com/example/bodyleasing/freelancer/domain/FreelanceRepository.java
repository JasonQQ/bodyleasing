package com.example.bodyleasing.freelancer.domain;

import com.example.bodyleasing.commontypes.FreelancerId;

import java.util.List;

public interface FreelanceRepository {
    Freelancer findById(FreelancerId freelancerId);

    List<Freelancer> findByName(String name);

    void add(Freelancer freelancer);

    void remove(Freelancer freelancer);
}
