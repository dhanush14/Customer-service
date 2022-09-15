package com.telstrajfs.customerservice.repository;

import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.telstrajfs.customerservice.model.Customer;

@Repository
public interface CustomerRepository extends CrudRepository<Customer, Integer> {

	
   
	
}
