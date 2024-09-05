package com.sandeep.Annotation_value;

import org.springframework.beans.factory.annotation.Value;

public class Student {
	private int rollno;
	private String name;
	private int age;
	
	public int getRollno() {
		return rollno;
	}
	@Value("101")
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getName() {
		return name;
	}
	@Value("Sandeep")
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	@Value("20")
	public void setAge(int age) {
		this.age = age;
	}
	
	public void show() {
		System.out.println("Name: "+name+
				"\nRoll no: "+rollno+
				"\nAge: "+age);
	}
}
