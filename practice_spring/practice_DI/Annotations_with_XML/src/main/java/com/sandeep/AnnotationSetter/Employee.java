package com.sandeep.AnnotationSetter;

import org.springframework.beans.factory.annotation.Autowired;

import lombok.ToString;

@ToString
public class Employee {
	private String ename;
	private Address address;
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	
	public Address getAddress() {
		return address;
	}
	
	@Autowired
	public void setAddress(Address address) {
		this.address = address;
	}
	
}
