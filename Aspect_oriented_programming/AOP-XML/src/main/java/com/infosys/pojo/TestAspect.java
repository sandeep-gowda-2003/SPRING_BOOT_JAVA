package com.infosys.pojo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAspect {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
		BusinessClass obj=context.getBean("businessBean",BusinessClass.class);
//		obj.welcome();
		obj.sum(10,20);	
	}

}
