package com.practice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.practice.entity.Address;
import com.practice.response.AddressResponse;
import com.practice.service.AddressService;

@RestController
@RequestMapping("/address")
public class AddressController {
	@Autowired
	private AddressService service;


	@PostMapping("/insert")
	public ResponseEntity<Address> push(@RequestBody Address address) {
		return service.insert(address);
	}

	@GetMapping(value="/fetch/{id}",produces="application/json")
	public ResponseEntity<AddressResponse> fetch(@PathVariable("id") Integer id){
		return new ResponseEntity<AddressResponse>(service.fetchbyId(id),HttpStatus.OK);
	}
	
	@PostMapping(value="/update/{id}",produces="application/json")
	public ResponseEntity<AddressResponse> update(@PathVariable("id") Integer id,@RequestParam("city") String city,@RequestParam("state") String state){
		return new ResponseEntity<AddressResponse>(service.updatebyId(id, city, state),HttpStatus.OK);
	}
	

}
