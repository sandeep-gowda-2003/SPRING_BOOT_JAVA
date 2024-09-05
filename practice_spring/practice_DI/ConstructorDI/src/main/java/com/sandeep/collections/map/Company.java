package com.sandeep.collections.map;

import java.util.Map;

public class Company {
	private Map<String,String> employees;
	public Company (Map<String,String> employees) {
		this.employees = employees;
	}
	public void display() {
		for(Map.Entry<String,String> emp:employees.entrySet()) {
			System.out.println("KEY: "+ emp.getKey() + "  VALUE: "+ emp.getValue());
		}
	}
}