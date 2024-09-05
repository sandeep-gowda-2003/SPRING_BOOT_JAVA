package com.sandeep.BeanScope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainTest {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("beanScope_config.xml");
		HelloWorld hw1 = context.getBean("helloworld1",HelloWorld.class);
		HelloWorld hw2 = context.getBean("helloworld1",HelloWorld.class);
		System.out.println(hw1==hw2);
		System.out.println(System.identityHashCode(hw1)+" ==  "+System.identityHashCode(hw2));
	}

}
