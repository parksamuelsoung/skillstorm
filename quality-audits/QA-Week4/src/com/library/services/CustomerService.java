package com.library.services;

import com.library.models.Customer;

public interface CustomerService {
	
	public String createCustomerProfile(Customer customer);
	public Customer getCustomerProfile(int CustomerId);
	public Customer updateCustomerProfile(Customer customer);
	public void deleteCustomerProfile(int CustomerId);

}
