package com.sandeep.Annotation_types;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainTest {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(EmployeeConfig.class);
		Employee e= context.getBean("employee",Employee.class);
		System.out.println(e.toString());
	}

}
