package com.practice.feignclient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.practice.response.AddressResponse;

//@FeignClient(name = "MicroService2",url = "http://localhost:8082",path = "/address")
@FeignClient("MICROSERVICE2")
public interface AddressClient {
	@PostMapping("/insert")
	public ResponseEntity<AddressResponse> push(@RequestBody AddressResponse a);

	@GetMapping(value="address/fetch/{id}",produces="application/json")
	public ResponseEntity<AddressResponse> fetchbyId(@PathVariable("id") Integer id);
}
	