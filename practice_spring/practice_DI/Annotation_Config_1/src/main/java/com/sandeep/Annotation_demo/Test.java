package com.sandeep.Annotation_demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(CollegeConfig.class);
		College col = context.getBean("college",College.class);
		College col1 = context.getBean("college",College.class);
		col.print();
		System.out.print(col==col1);
	}

}
