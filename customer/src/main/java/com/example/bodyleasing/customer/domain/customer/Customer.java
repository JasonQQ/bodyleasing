package com.example.bodyleasing.customer.domain.customer;

import com.example.bodyleasing.commontypes.CustomerId;
import com.example.bodyleasing.microarchitecture.Aggregate;
import com.example.bodyleasing.microarchitecture.AggregateBuilder;
import lombok.Builder;
import lombok.Data;

@Data
@Aggregate
public class Customer {

    private final CustomerId customerId;
    private final String name;
    private final Address address;

    @Builder
    @AggregateBuilder
    public static class CustomerBuilder {

        private CustomerId customerId;
        private String name;
        private Address address;
    }
}
