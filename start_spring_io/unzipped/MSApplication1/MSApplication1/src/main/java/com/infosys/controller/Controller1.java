package com.infosys.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/employee")
public class Controller1 {

	@GetMapping("/message")
	public String getMessage(@RequestHeader("first-request") String header) {
		System.out.println(header);
		return "Hello from Application1";
	}
}
