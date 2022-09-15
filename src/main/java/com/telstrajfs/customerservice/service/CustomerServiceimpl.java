package com.telstrajfs.customerservice.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.telstrajfs.customerservice.model.Customer;
import com.telstrajfs.customerservice.repository.CustomerRepository;

@Service
public class CustomerServiceimpl implements CustomerService {
	@Autowired
	private CustomerRepository customerRepository;

	@Override
	public Optional<Customer> getCustomerById(int customerId) {
		// TODO Auto-generated method stub
		return customerRepository.findById(customerId);
	}

	@Override
	public List<Customer> getAllCustomer() {
		// TODO Auto-generated method stub
		return (List<Customer>) customerRepository.findAll();
	}

	@Override
	public void addCustomer(Customer customer) {
		// TODO Auto-generated method stub
		customerRepository.save(customer);
		
	}

	@Override
	public void deleteCustomerById(int customerId) {
		// TODO Auto-generated method stub
		customerRepository.deleteById(customerId);
		
	}

	

}
