package com.sandeep.Object_list_string;

import java.util.List;

import lombok.Data;

@Data
public class Student {
	private int sid;
	private String name;
	private Address address;
	private List<String> subjectNames;
	
}
