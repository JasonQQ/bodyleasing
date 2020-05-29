package com.example.bodyleasing.customer.domain.customer;

import com.example.bodyleasing.microarchitecture.Aggregate;
import com.example.bodyleasing.microarchitecture.AggregateBuilder;
import lombok.Builder;
import lombok.Data;

@Data
@Aggregate
public class Customer {

    private final CustomerID customerID;
    private final String name;
    private final Address address;

    @Builder
    @AggregateBuilder
    public static class CustomerBuilder {

        private CustomerID customerID;
        private String name;
        private Address address;
    }
}
