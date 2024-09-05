package com.infosys.Emp_info;

import org.springframework.beans.factory.annotation.Autowired;

import lombok.ToString;

@ToString
public class Employee {
	private Integer empId;
	private String empName;
	private Address address;
	
	@Autowired
	public Employee(Integer empId, String empName, Address address) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.address = address;
	}
	
	
}
