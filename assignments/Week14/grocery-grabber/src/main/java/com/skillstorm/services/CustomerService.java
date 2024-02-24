package com.skillstorm.services;

import java.util.List;

import com.skillstorm.models.Customer;

public interface CustomerService {
    
    List<Customer> findAll();
    Customer findById(long customerId);
    Customer save(Customer customer);
}