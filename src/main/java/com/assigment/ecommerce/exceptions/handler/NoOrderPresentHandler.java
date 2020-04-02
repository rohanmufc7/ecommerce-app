package com.assigment.ecommerce.exceptions.handler;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import com.assigment.ecommerce.exceptions.NoOrderPresentException;

@RestControllerAdvice
public class NoOrderPresentHandler {

	@ExceptionHandler(value = NoOrderPresentException.class)
	public ResponseEntity<Object> exception(NoOrderPresentException exception) {
		return new ResponseEntity<>("No Order Found", HttpStatus.NOT_FOUND);
	}
}
