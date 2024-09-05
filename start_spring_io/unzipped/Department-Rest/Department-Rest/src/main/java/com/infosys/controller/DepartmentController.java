package com.infosys.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.infosys.entity.Departments;
import com.infosys.service.DepartmentService;

@RestController
@RequestMapping("/api/departments")
public class DepartmentController {

	@Autowired
	private DepartmentService departmentservice;
	
	@PostMapping
	public ResponseEntity<Departments> saveDepartment(@RequestBody Departments department){
		Departments savedDepartment=departmentservice.saveDepartment(department);
		return new ResponseEntity<>(savedDepartment,HttpStatus.CREATED);
	}
	
	@GetMapping("{id}")
	public ResponseEntity<Departments> getDepartmentById(@PathVariable("id") Long deptid){
		Departments Department=departmentservice.getDepartmentById(deptid);
		return new ResponseEntity<>(Department,HttpStatus.OK);
	}
	
}
