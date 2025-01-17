package com.infosys.pojo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		EmailService eservice = context.getBean("emailService",EmailService.class);
		SmsService sservice = context.getBean("smsService",SmsService.class);
		System.out.println(eservice.toString());;
		System.out.println(sservice.toString());
	}
}
