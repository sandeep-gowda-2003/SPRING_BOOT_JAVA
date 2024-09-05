package com.infosys.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.infosys.entity.Product;

@RestController
public class ProductController {
	@GetMapping("/products/{id}")
	public Product getProductById(@PathVariable("id") Long id)
	{
		return new Product(id,"sample Product",99.99);
	}
}
