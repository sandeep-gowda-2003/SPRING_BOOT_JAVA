package com.sandeep.primitive_string;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context= new ClassPathXmlApplicationContext("primitive_config.xml");
		Employee Test=context.getBean("constructordi",Employee.class);
		Test.display();
	}

}
