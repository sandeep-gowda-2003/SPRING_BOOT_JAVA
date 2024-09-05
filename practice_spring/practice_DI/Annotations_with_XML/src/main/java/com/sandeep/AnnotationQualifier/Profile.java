package com.sandeep.AnnotationQualifier;

import org.springframework.beans.factory.annotation.Autowired;

public class Profile {

	@Autowired
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
