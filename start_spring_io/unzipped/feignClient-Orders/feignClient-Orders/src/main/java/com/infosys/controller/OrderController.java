package com.infosys.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.infosys.Service.OrderService;

@RestController
public class OrderController {

	@Autowired
	private OrderService orderservice;
	
	@GetMapping("/orders/{id}")
	public Product getProductById(@PathVariable("id") Long id) {
		System.out.println("in order controller");
		return orderservice.getProductById(id);
	}
}
