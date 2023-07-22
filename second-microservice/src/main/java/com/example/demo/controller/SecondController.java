package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/secondservice")
public class SecondController {

	@GetMapping("")
	public String getMessage() {
		return "thanks for called, I am Second Microservice";
	}
}
