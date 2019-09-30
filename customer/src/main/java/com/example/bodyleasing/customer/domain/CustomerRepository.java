package com.example.bodyleasing.customer.domain;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
    Customer findById(CustomerID customerID);

    List<Customer> findByName(String name);

    void add(Customer customer);

    void remove(Customer customer);
}
