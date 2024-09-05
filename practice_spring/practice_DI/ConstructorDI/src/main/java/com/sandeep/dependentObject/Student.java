package com.sandeep.dependentObject;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
public class Student {
	private Integer sid;
	private String sname;
	private Address address;
	void display() {
		System.out.println(sid+" "+sname+" "+address.toString());
	}
}
