package com.infosys.entity;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
public class Employee {
	private int id;
	private String name;
	void show() {
		System.out.println(id+" "+name);
	}
}