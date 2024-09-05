package com.infosys.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/consumer")
public class Controller2 {

	@GetMapping("/message")
	public String getMessage(@RequestHeader("second-request") String header) {
		System.out.println(header);
		return "Hello from Application2";
	}
}
