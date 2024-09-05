package com.sandeep.primitive_string;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class Employee {
	private Integer emp_id;
	private String emp_name;
	public void display() {
		System.out.println(emp_id+" "+emp_name);
	}
}
