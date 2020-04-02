package com.assigment.ecommerce.services;

import org.springframework.stereotype.Service;

import com.assigment.ecommerce.entity.User;

@Service
public interface UserService {

	public String addUser(User user);

	public String checkUser(User user);
}
