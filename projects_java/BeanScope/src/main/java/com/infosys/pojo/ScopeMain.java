package com.infosys.pojo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ScopeMain {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("config.xml");
		HelloWorld hw1=context.getBean("hw",HelloWorld.class);
		System.out.println(hw1.toString());
		HelloWorld hw2=context.getBean("hw",HelloWorld.class);
		System.out.println(hw2.toString());
		System.out.println(hw1==hw2);
		System.out.println(System.identityHashCode(hw1));
		System.out.println(System.identityHashCode(hw2));
	}

}
