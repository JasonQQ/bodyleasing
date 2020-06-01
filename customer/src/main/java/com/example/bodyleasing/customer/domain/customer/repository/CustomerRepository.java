package com.example.bodyleasing.customer.domain.customer.repository;

import com.example.bodyleasing.commontypes.CustomerId;
import com.example.bodyleasing.customer.domain.customer.Customer;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.stereotype.Repository;

@NoRepositoryBean
@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {

    Customer findByCustomerId(CustomerId customerId);

    List<Customer> findByName(String name);

    void add(Customer customer);

    void remove(Customer customer);

    void removeByCustomerId(CustomerId customerId);
}
