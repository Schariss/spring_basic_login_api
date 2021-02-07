package com.adnane.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.adnane.model.User;
import com.adnane.repository.UserRepository;

@RestController
public class UserController {

	@Autowired
	private UserRepository userRepository;
	
	@PostMapping("/register")
	public User register(@RequestBody User user) {
		return userRepository.save(user);
	}
	
	@PostMapping("/login")
	public ResponseEntity<User> login(@RequestBody User user) {
		User user2 = userRepository.findByEmailAndPassword(user.getEmail(), user.getPassword());
		if(user2 != null)
			return new ResponseEntity<User>(user2, HttpStatus.OK);
		else {
			return new ResponseEntity<User>(user2, HttpStatus.NOT_FOUND);
		}
	}
}
