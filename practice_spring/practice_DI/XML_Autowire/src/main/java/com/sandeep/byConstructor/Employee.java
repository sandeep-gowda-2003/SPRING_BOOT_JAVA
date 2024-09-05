package com.sandeep.byConstructor;

import org.springframework.beans.factory.annotation.Autowired;

import lombok.AllArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@ToString
public class Employee {
	private String ename;
	private Address address;
}
