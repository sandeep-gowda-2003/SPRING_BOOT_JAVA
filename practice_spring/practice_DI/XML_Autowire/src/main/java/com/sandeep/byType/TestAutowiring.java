package com.sandeep.byType;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAutowiring {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("byType_config.xml");
		Employee e=context.getBean("employee",Employee.class);
		System.out.print(e.toString());
	}

}