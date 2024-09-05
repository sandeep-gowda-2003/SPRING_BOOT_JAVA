package com.infosys.qualifier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Profile {
	
	@Autowired
	@Qualifier("student2")
	private Student student;
	
	public Profile() {
		System.out.println("inside default constructor");
	}
	
	public void printName() {
		System.out.println("Name"+student.getSname());
		
	}
	
	public void printAge() {
		System.out.println("Age"+student.getAge());
		
	}
}
