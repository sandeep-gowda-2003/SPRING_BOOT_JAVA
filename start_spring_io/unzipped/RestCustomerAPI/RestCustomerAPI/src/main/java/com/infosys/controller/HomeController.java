package com.infosys.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.infosys.entity.Customer;
import com.infosys.service.CustomerService;

@RestController
@RequestMapping("/customers")
public class HomeController {
	@Autowired
	CustomerService service;
	
//	@GetMapping("/{cid}")
	@GetMapping(value = "/{cid}",produces="application/json")
	public ResponseEntity<Customer> getById(@PathVariable("cid") int cid){
		Customer customer=service.getById(cid);
		System.out.println("\ninside controller");
		return ResponseEntity.ok(customer);
	}
	@GetMapping(produces = "application/json")
	public List<Customer> fetchDetails(@RequestParam("custId") Integer custId,@RequestParam("fname") String fname){
		System.out.println(custId+" "+custId.getClass());
		System.out.println(fname+" "+fname.getClass());
		return service.fetchCustomerDetails(custId, fname);
	}
	
}
