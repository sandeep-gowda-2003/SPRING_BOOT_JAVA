package com.sandeep.dependentObject;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("dependent_config.xml");
		Student s=context.getBean("student",Student.class);
		s.display();
	}

}
