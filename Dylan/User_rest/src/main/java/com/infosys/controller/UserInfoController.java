package com.infosys.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.infosys.dto.ResponseDTO;
import com.infosys.service.UserInfoService;

@RestController
@RequestMapping("/api/users")
public class UserInfoController {

	@Autowired
	private UserInfoService service;
	
	@GetMapping("/{id}")
	public ResponseEntity<ResponseDTO> getUserInfo(@PathVariable("id") Long id){
		ResponseDTO responseDTO = service.getUser(id);
		System.out.println(responseDTO.toString());
		return ResponseEntity.ok(responseDTO);
	}
	
}
