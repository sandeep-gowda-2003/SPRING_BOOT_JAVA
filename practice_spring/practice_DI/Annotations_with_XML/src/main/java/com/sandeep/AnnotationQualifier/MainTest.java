package com.sandeep.AnnotationQualifier;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainTest {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("config_qualifier.xml");
		Profile p=context.getBean("profile",Profile.class);
		p.printAge();
		p.printName();
	}

}
