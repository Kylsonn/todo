package com.kbsystems.todo.builder;

import java.util.Date;

import com.kbsystems.todo.domain.User;

public class UserBuilder {
	private User user;
	public UserBuilder() {
		user = new User();
	}
	public UserBuilder setPassword(String password) {
		user.setPassword(password);
		return this;
	}
	public UserBuilder setUsername(String username) {
		user.setUsername(username);
		return this;
	}
	public UserBuilder setName(String name) {
		user.setName(name);
		return this;
	}
	public UserBuilder setBirthday(Date birthday) {
		user.setBirthday(birthday);
		return this;
	}
	public UserBuilder setEmail(String email) {
		user.setEmail(email);
		return this;
	}
	
	public UserBuilder setId(Long id) {
		user.setId(id);
		return this;
	}
	public User toUser() {
		return user;
	}
}
