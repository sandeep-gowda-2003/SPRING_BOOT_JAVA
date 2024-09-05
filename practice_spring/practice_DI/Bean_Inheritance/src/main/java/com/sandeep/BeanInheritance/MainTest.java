package com.sandeep.BeanInheritance;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainTest {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("InheritanceConfig.xml");
		Customer c = context.getBean(Customer.class);
		System.out.println(c);
	}

}
