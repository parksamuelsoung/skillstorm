package com.skillstorm.services.impls;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.skillstorm.models.Customer;
import com.skillstorm.repositories.CustomerRepository;
import com.skillstorm.services.CustomerService;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    public CustomerServiceImpl(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @Override
    public List<Customer> findAll() {
        return customerRepository.findAll();
    }

    @Override
    public Customer findById(long customerId) {
        Optional<Customer> optionalCustomer = customerRepository.findById(customerId);
        if (optionalCustomer.isPresent()) {
            return optionalCustomer.get();
        } else {
            throw new IllegalArgumentException("Id not found.");
        }
    }

    @Override
    public Customer save(Customer customer) {
        if (customer != null) {
            return customerRepository.save(customer);
        } else {
            throw new IllegalArgumentException("Customer is null.");
        }
    }
    

}
