package com.raveera.mongodb.springbootmongodbexample.resource;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.raveera.mongodb.springbootmongodbexample.document.User;
import com.raveera.mongodb.springbootmongodbexample.repository.UserRepository;

@RestController
@RequestMapping("/rest/users")
public class UserResource {
	
	private UserRepository userRepository;
	
	public UserResource(UserRepository userRepository) {
		super();
		this.userRepository = userRepository;
	}
	
	@GetMapping("/all")
	public List<User>getAll() {
		return userRepository.findAll();
	}

}
