package com.infosys.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demo")
public class DemoController {
	@GetMapping("/service")
	public ResponseEntity<String> getAnonymous(){
		return ResponseEntity.ok("Welcome to Demo Controller");
	}
	
}
