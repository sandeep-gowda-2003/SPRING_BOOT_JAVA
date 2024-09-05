package com.sandeep.Object_list_string;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Setter_test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("setterConfig_O_L_S.xml");
		Student s = context.getBean("student",Student.class);
		System.out.println(s.toString());
	}

}
