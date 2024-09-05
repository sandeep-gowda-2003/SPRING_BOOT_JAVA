package com.infosys.controller;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name="feignClient-Product",url="http://localhost:8081")
public interface ProductClient {
	@GetMapping("/products/{id}")
	Product getProductById(@PathVariable("id") Long id);
}
