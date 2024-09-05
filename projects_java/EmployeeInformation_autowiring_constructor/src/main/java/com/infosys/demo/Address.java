package com.infosys.demo;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Address {
	private String city;
	private String state;
	private Integer zip;
}
