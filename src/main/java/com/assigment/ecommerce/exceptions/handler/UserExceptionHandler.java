package com.assigment.ecommerce.exceptions.handler;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.assigment.ecommerce.exceptions.UserNotFoundException;

@RestControllerAdvice
public class UserExceptionHandler {

	@ExceptionHandler(value = UserNotFoundException.class)
	public ResponseEntity<Object> exception(UserNotFoundException exception) {
		return new ResponseEntity<>("User Not Found", HttpStatus.NOT_FOUND);
	}
}
