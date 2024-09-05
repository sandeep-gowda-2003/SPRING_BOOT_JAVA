package com.sandeep.AnnotationConstructor;

import org.springframework.beans.factory.annotation.Autowired;

import lombok.ToString;

@ToString
public class Employee {
	private String ename;
	private Address address;
	
	@Autowired
	public Employee(String ename, Address address) {
		super();
		this.ename = ename;
		this.address = address;
	}
	
}
