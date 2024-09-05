package com.sandeep.collections.list;

import java.util.ArrayList;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class Student {
	private int sid;
	private String sname;
	private List<String> subjectName;
	
	public void show() {
		System.out.println(sid + " "+sname+"\n");
		for (String str:subjectName) {
			System.out.println(str+"\n");			
		}
	}
}
