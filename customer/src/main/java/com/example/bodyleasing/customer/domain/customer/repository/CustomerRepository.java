package com.example.bodyleasing.customer.domain.customer.repository;

import com.example.bodyleasing.customer.domain.customer.Customer;
import com.example.bodyleasing.customer.domain.customer.CustomerID;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

@NoRepositoryBean
public interface CustomerRepository extends JpaRepository<Customer, Long> {

    Customer findByCustomerID(CustomerID customerID);

    List<Customer> findByName(String name);

    void add(Customer customer);

    void remove(Customer customer);
}
