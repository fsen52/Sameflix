package com.Sameflix.backend.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RequestMapping
@RestController
public class Controller {
	
	@GetMapping()
	String mesaj() {
		return "Welcome to";
	};

}
