package com.telstrajfs.customerservice.service;

import java.util.List;
import java.util.Optional;

import com.telstrajfs.customerservice.model.Customer;

public interface CustomerService {
	
	public Optional<Customer> getCustomerById(int customerId);
	public List<Customer> getAllCustomer();
	public void addCustomer(Customer customer);
	public void deleteCustomerById(int customerId);
	//public void updateCustomer(int customerId, String customerName,String city,String country);
	

}
