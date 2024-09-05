package com.infosys.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(BeanConfig.class);
		Bank obj = context.getBean("bank",Bank.class);
		obj.setAccountNumber(1101);
		obj.setAmount(0);
		System.out.println(obj);
		System.out.println("calling deposit method");
		obj.deposit(5000);
		obj.checkBalance();
		
	}

}
