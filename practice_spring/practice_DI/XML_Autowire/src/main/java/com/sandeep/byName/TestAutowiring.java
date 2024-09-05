package com.sandeep.byName;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAutowiring {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("byName_config.xml");
		Employee e=context.getBean(Employee.class);
		System.out.print(e.toString());
	}

}