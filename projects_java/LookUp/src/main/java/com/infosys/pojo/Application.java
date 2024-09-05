package com.infosys.pojo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		User u = context.getBean(User.class);
		u.setUsername("sandeep");
		System.out.println(u.assignRole("Admin"));
		System.out.println(u.assignRole("superuser"));
	}

}
