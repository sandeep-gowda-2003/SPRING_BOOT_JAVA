package com.infosys.Emp_info.setter;

import org.springframework.beans.factory.annotation.Autowired;

import lombok.ToString;

@ToString
public class Employee {
	private Integer empId;
	private String empName;
	private Address address;
	public Integer getEmpId() {
		return empId;
	}
	public void setEmpId(Integer empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public Address getAddress() {
		return address;
	}
	
	@Autowired
	public void setAddress(Address address) {
		this.address = address;
	}
	
	
	
}
