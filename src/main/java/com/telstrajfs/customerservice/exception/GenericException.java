package com.telstrajfs.customerservice.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;

@ControllerAdvice
public class GenericException {

	public ResponseEntity<String> customerNotFound(CustomerNotFoundException ex){
		return new ResponseEntity<String>("Customer Not Found...",HttpStatus.NOT_FOUND);
	}
}
