package com.infosys.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.infosys.entity.Employee;
import com.infosys.service.EmployeeService;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

	@Autowired
	EmployeeService service;
	
	public void display(List<Employee> gg) {
		for(Employee emp:gg) {
			System.out.println(emp.toString());
		}
	}
//	@GetMapping(produces = "application/json")
//	public List<Employee> getAll() {
//		
//		List<Employee> emps =  service.getAll();
//		display(emps);
//		return emps;
//	}
//	
//	@GetMapping(value ="/{id}",produces = "application/json")
//	public Employee getById(@PathVariable("id") Integer id) {
//		return service.getById(id);
//	}
	
	@GetMapping(produces = "application/json")
	public Employee getByIdAndName(@RequestParam("id") Integer id,@RequestParam("name") String name) {
		return service.getBydeets(id, name);
	}
	
	@PostMapping(consumes = "application/json")
	public ResponseEntity addEmployee(@RequestBody Employee employee) {
		Employee emp = service.addEmp(employee);
		return new ResponseEntity<Employee>(emp,HttpStatus.ACCEPTED);
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<String> delEntity(@PathVariable Integer id){
		Employee employee = service.getById(id);
		service.delete(employee);
		String response = employee.getName() +" is removed.";
		return new ResponseEntity<String>(response,HttpStatus.OK);
	}
	
	@PutMapping(value ="/{id}"  ,consumes= "application/json" )
	public ResponseEntity<String> upEntity(@RequestBody Employee employee,@PathVariable("id") Integer id){
		Employee employee2 = service.updateEmployee(employee, id);
		String responseString = employee2.toString() +" is updated";
		return new ResponseEntity<String>(responseString,HttpStatus.ACCEPTED);
	}
}


