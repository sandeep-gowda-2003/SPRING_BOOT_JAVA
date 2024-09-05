package com.infosys.customer1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Client {

	public static void main(String[] args) {
		ApplicationContext context= new  AnnotationConfigApplicationContext(SpringConfiguration.class);
		CustomerServiceImpl service = (CustomerServiceImpl)context.getBean("customerService");
		System.out.println(service.createCustomer());
	}

}
