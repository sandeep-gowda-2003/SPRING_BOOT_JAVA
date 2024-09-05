package com.infosys.qualifier;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("Emp_config_qualifier.xml");
		Profile p=context.getBean("profile",Profile.class);
		p.printAge();
		p.printName();
	}

}
