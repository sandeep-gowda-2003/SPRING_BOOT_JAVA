package com.sandeep.collections.list;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("collections_list.xml");
		Student s=context.getBean("student",Student.class);
		s.show();
	}

}
