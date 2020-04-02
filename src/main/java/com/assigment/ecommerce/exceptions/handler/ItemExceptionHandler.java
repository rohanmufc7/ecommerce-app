package com.assigment.ecommerce.exceptions.handler;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.assigment.ecommerce.exceptions.ItemNotFoundException;

@RestControllerAdvice
public class ItemExceptionHandler {

	@ExceptionHandler(value = ItemNotFoundException.class)
	public ResponseEntity<Object> exception(ItemNotFoundException exception) {
		return new ResponseEntity<>("Item Not Found", HttpStatus.NOT_FOUND);
	}
}
