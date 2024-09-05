package com.infosys.pojo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context = new 
				ClassPathXmlApplicationContext("Application_config.xml");
		Custmer c = context.getBean("customer",Custmer.class);
		System.out.print(c);
	}

}
