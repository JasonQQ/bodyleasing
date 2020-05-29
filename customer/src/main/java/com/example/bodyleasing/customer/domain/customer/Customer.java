package com.example.bodyleasing.customer.domain.customer;

import com.example.bodyleasing.microarchitecture.Aggregate;
import com.example.bodyleasing.microarchitecture.AggregateBuilder;
import lombok.Builder;

@Aggregate
public class Customer {

    private final CustomerID customerID;
    private final Address address;

    public Customer(CustomerID customerID, Address address) {
        this.customerID = customerID;
        this.address = address;
    }

    @Builder
    @AggregateBuilder
    public static class CustomerBuilder {

        private CustomerID customerID;
        private Address address;
    }
}
