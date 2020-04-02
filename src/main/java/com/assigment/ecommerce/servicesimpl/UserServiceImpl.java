package com.assigment.ecommerce.servicesimpl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.assigment.ecommerce.dao.UserRepository;
import com.assigment.ecommerce.entity.User;
import com.assigment.ecommerce.exceptions.UserNotFoundException;
import com.assigment.ecommerce.services.UserService;

@Component
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;

	@Override
	public String addUser(User user) {
		userRepository.save(user);
		return "successfully added user";
	}

	@Override
	public String checkUser(User user) {
		Optional<User> optional = userRepository.findByEmail(user.getEmail());
		if (optional.isPresent()) {
			return "Valid user";
		} else {
			throw new UserNotFoundException();
		}
	}

}
