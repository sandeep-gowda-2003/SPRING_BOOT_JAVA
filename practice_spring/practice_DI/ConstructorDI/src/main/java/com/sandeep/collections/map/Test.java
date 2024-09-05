package com.sandeep.collections.map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("collections_map.xml");
		Company c= context.getBean("company",Company.class);
		c.display();
	}

}
