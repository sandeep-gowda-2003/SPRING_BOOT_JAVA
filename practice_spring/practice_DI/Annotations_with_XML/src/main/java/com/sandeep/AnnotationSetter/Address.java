package com.sandeep.AnnotationSetter;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class Address {
	private String city;
	private int zipCode;
}
