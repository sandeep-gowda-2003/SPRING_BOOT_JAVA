package com.infosys.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.infosys.entity.ResponseDto;
import com.infosys.service.UserInfoService;


@RestController
@RequestMapping("/api/users")
public class UserInfoController {
	@Autowired
	private UserInfoService userservice;
	
	@GetMapping("/{id}")
	public ResponseEntity<ResponseDto> getUser(@PathVariable("id") Long userid){
		ResponseDto responsedto = userservice.getUser(userid);
		System.out.println(responsedto.toString());
		return ResponseEntity.ok(responsedto);
	}
}
