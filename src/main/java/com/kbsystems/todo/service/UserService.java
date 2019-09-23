package com.kbsystems.todo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kbsystems.todo.domain.User;
import com.kbsystems.todo.repository.UserRepository;

@Service
public class UserService {
	
	private UserRepository userRepository;
		
	public UserService(@Autowired UserRepository userRepository) {
		super();
		this.userRepository = userRepository;
	}


	public User create(User user) {
		User userSaved = userRepository.save(user);
		return userSaved;
	}
}
