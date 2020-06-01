package com.example.bodyleasing.customer.infrastructure;

import com.example.bodyleasing.commontypes.CustomerId;
import com.example.bodyleasing.customer.domain.customer.Customer;
import com.example.bodyleasing.customer.domain.customer.repository.CustomerRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Repository;

@Repository
public class CustomerRepositoryImpl implements CustomerRepository {

    @Override
    public Customer findByCustomerId(CustomerId customerId) {
        return null;
    }

    @Override
    public List<Customer> findByName(String name) {
        return null;
    }

    @Override
    public void add(Customer customer) {

    }

    @Override
    public void remove(Customer customer) {

    }

    @Override
    public void removeByCustomerId(CustomerId customerId) {

    }

    @Override
    public List<Customer> findAll() {
        return null;
    }

    @Override
    public List<Customer> findAll(Sort sort) {
        return null;
    }

    @Override
    public Page<Customer> findAll(Pageable pageable) {
        return null;
    }

    @Override
    public List<Customer> findAllById(Iterable<Long> iterable) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(Long aLong) {

    }

    @Override
    public void delete(Customer customer) {

    }

    @Override
    public void deleteAll(Iterable<? extends Customer> iterable) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public <S extends Customer> S save(S s) {
        return null;
    }

    @Override
    public <S extends Customer> List<S> saveAll(Iterable<S> iterable) {
        return null;
    }

    @Override
    public Optional<Customer> findById(Long aLong) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Long aLong) {
        return false;
    }

    @Override
    public void flush() {

    }

    @Override
    public <S extends Customer> S saveAndFlush(S s) {
        return null;
    }

    @Override
    public void deleteInBatch(Iterable<Customer> iterable) {

    }

    @Override
    public void deleteAllInBatch() {

    }

    @Override
    public Customer getOne(Long aLong) {
        return null;
    }

    @Override
    public <S extends Customer> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends Customer> List<S> findAll(Example<S> example) {
        return null;
    }

    @Override
    public <S extends Customer> List<S> findAll(Example<S> example, Sort sort) {
        return null;
    }

    @Override
    public <S extends Customer> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends Customer> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends Customer> boolean exists(Example<S> example) {
        return false;
    }
}
