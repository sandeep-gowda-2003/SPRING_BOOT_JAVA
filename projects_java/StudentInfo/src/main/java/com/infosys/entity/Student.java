package com.infosys.entity;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
public class Student {
	private int sid;
	private String name;
	private Address address;
	
	void show()
	{
		System.out.println(sid + " "+name+" "+address);
	}
}
