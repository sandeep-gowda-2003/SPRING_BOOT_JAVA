package com.infosys.Annotation_types;

import lombok.ToString;

@ToString
public class Address {
	private String city;
	private String zipCode;
	
	public Address(String city, String zipCode) {
		super();
		this.city = city;
		this.zipCode = zipCode;
	}
	
}
