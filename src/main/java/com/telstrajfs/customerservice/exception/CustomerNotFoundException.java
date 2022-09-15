package com.telstrajfs.customerservice.exception;

public class CustomerNotFoundException extends RuntimeException{

	
	public CustomerNotFoundException() {
		
	}
	
	public CustomerNotFoundException(String message) {
		super(message);
	}
}
