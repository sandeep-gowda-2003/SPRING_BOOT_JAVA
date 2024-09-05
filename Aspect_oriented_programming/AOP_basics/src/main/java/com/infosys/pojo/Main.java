package com.infosys.pojo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) throws Exception {
		ApplicationContext context = new AnnotationConfigApplicationContext(AopConfig.class);
		Customer customer = context.getBean("customer",Customer.class);
//		customer.addCustomer();
//		customer.addCustomerReturnValue();
//		customer.addCustomerThrowException();
		customer.addCustomerAround("sangy");
	}

}