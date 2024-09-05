package com.sandeep.AnnotationConstructor;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

@ToString
@AllArgsConstructor
public class Address {
	private String city;
	private int zipCode;
}
