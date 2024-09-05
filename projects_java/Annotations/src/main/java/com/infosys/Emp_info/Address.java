package com.infosys.Emp_info;

import lombok.ToString;

@ToString
public class Address {
	private String city;
	private Long zipCode;
	public Address(String city, Long zipCode) {
		super();
		this.city = city;
		this.zipCode = zipCode;
	}
	
}
