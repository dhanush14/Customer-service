package com.telstrajfs.customerservice.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.telstrajfs.customerservice.exception.CustomerNotFoundException;
import com.telstrajfs.customerservice.model.Customer;
import com.telstrajfs.customerservice.service.CustomerService;

@RestController
@RequestMapping("/customer")
public class CustomerController {
	
	@Autowired
	private CustomerService customerService;
	
	@GetMapping("/{customerId}")
	public Customer getCustomerById(@PathVariable int customerId) {
		 Optional<Customer> custOpt= customerService.getCustomerById(customerId);
		//<Customer> custOpt=customerService.getCustomerById(customerId);
			if(custOpt.isPresent()) {
				throw new CustomerNotFoundException();
			}
			return custOpt.get();
		 
	}
	
	@GetMapping("")
	public List<Customer> getAllCustomers(){
		return customerService.getAllCustomer();
	}
	
	@PostMapping("") 
	public ResponseEntity<String> saveCustomer(@RequestBody Customer customer){
		customerService.addCustomer(customer);;
		return new ResponseEntity<>("New customer added with Id:"+customer.getCustomerId(),HttpStatus.OK);
	}
	
	@DeleteMapping("/{customerId}")
	public ResponseEntity<String> deleteCustomerById(@PathVariable int customerId){
		Optional<Customer> custOpt=customerService.getCustomerById(customerId);
		if(custOpt.isEmpty()) {
			
		}
		customerService.deleteCustomerById(customerId);
		return new ResponseEntity<>("Customer deleted with Id:"+customerId,HttpStatus.OK);
	}
	
	
}
