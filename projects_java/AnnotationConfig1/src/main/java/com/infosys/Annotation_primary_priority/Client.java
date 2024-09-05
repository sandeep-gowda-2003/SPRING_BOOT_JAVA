package com.infosys.Annotation_primary_priority;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Client {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		EmailService eservice= context.getBean(EmailService.class);
		eservice.sendEmail();
	}

}
