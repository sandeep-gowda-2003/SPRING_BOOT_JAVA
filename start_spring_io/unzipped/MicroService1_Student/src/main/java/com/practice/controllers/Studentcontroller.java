package com.practice.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.practice.entity.Student;
import com.practice.response.StuAdress;
import com.practice.response.StudentResponse;
import com.practice.service.StudentService;

@RestController
@RequestMapping("/student")
public class Studentcontroller {
	@Autowired
	private StudentService service;

	@PostMapping(value = "/insert", consumes = "application/json")
	public String in(@RequestBody StuAdress s) {
		String resp = service.insertOne(s);
		return "successfully inserted";
	}

	@PostMapping(value = "/insertstu", consumes = "application/json")
	public ResponseEntity<Student> in(@RequestBody Student s) {
		Student resp = service.insert(s);
		return new ResponseEntity<Student>(resp,HttpStatus.ACCEPTED);
	}
	@GetMapping(value="/fetch/{id}",produces="application/json")
	public ResponseEntity<StudentResponse> fetch(@PathVariable("id") Integer id){
		return new ResponseEntity<StudentResponse>(service.fetchbyId(id),HttpStatus.OK);
	}
	
	@GetMapping(value="/fetchall/{id}",produces="application/json")
	public ResponseEntity<StuAdress> fetch_all(@PathVariable("id") Integer id){
		System.out.println("insitde contrller");
		return new ResponseEntity<StuAdress>(service.fetchall(id),HttpStatus.OK);
	}
	
}
