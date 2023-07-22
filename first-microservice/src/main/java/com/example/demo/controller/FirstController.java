package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class FirstController {

	@GetMapping("getmessage")
	public String getMessage() {
		return "Good morning from First microservice";
	}
	
}
