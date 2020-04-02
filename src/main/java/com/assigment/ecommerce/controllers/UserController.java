package com.assigment.ecommerce.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.assigment.ecommerce.entity.User;
import com.assigment.ecommerce.services.UserService;

@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserService userService;

	@GetMapping("/")
	public String test() {
		return "helllo";
	}

	@PostMapping("/signup")
	public ResponseEntity<String> signUp(@RequestBody User user) {

		String result = userService.addUser(user);
		return new ResponseEntity<String>(result, HttpStatus.ACCEPTED);
	}

	@PostMapping("/login")
	public ResponseEntity<String> login(@RequestBody User user) {

		String result = userService.checkUser(user);
		return new ResponseEntity<String>(result, HttpStatus.ACCEPTED);
	}
}
