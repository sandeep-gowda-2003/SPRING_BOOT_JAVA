package com.sandeep.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.sandeep.config.AnnotationConfig;
import com.sandeep.dao.StudentDAO;

public class Main {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(AnnotationConfig.class);
		StudentDAO s = context.getBean(StudentDAO.class);
		
	}
}
