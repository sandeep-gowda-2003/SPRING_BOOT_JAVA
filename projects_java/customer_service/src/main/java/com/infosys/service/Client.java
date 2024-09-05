package com.infosys.service;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
		Report_service reportService = context.getBean("reportService",Report_service.class);
		reportService.display();
	}

}
