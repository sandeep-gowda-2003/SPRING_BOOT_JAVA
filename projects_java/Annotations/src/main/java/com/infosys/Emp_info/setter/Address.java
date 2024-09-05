package com.infosys.Emp_info.setter;

import lombok.ToString;

@ToString
public class Address {
	private String city;
	private Long zipCode;
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public Long getZipCode() {
		return zipCode;
	}
	public void setZipCode(Long zipCode) {
		this.zipCode = zipCode;
	}

	
}
