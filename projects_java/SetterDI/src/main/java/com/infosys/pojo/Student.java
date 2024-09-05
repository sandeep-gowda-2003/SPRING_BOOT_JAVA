package com.infosys.pojo;

import java.util.List;

import lombok.Data;

@Data
public class Student {
	private int sid;
	private String name;
	private Address address;
	private List<String> subjectNames;
	void show() {
		System.out.println(sid+" "+name+" "+address);
		for(String sname:subjectNames) {
			System.out.println(sname);			
		}
	}
}
