package com.sandeep.AnnotationSetter;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AutoConfigTest {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("config_setter.xml");
		Employee e=context.getBean(Employee.class);
		System.out.println(e.toString());
	}

}

