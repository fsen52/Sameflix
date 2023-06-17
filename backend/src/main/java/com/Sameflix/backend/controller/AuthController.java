package com.Sameflix.backend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Sameflix.backend.Domain.User;
import com.Sameflix.backend.service.UserService;



@RequestMapping
@RestController
public class AuthController {
	
	@Autowired
	private UserService userService;
	
	@GetMapping()
	String mesaj() {
		return "Welcome to";
	};
	
	@PostMapping("/register")
	public ResponseEntity<User> registerUser(@RequestBody User user) {
		
		User returnedUser = userService.register(user);
		return new ResponseEntity<>(returnedUser,HttpStatus.CREATED);
		
	}

}
