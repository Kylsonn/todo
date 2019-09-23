package com.kbsystems.todo.service;

import static org.mockito.Mockito.when;

import java.util.Date;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import com.kbsystems.todo.builder.UserBuilder;
import com.kbsystems.todo.domain.User;
import com.kbsystems.todo.repository.UserRepository;

public class UserServiceTest {
	private UserService userService;
	
	@Mock
	private UserRepository userRepository;
	
	@Before
	public void setup() {
		MockitoAnnotations.initMocks(this);
		this.userService = new UserService(userRepository);
	}
	@Test
	public void create_new_user() {
		User user = new UserBuilder().setName("Daniel")
				.setBirthday(new Date())
				.setPassword("abcd1234")
				.setEmail("daniel@gmail.com")
				.setUsername("daniel").toUser();
		
		User userSaved = new UserBuilder().setName("Daniel")
				.setBirthday(new Date())
				.setPassword("abcd1234")
				.setEmail("daniel@gmail.com")
				.setId(1L)
				.setUsername("daniel").toUser();
		when(userRepository.save(user)).thenReturn(userSaved);
		User userCreated = userService.create(user);
		assertThat(userCreated.getId(), equalTo(userSaved.getId()));
	}
	

}
