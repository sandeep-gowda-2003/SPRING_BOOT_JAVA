package com.sandeep;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class EmpMain {

	public static void main(String[] args) {
		ApplicationContext context= new AnnotationConfigApplicationContext(EmpConfig.class);
		EmployeeImpl e = context.getBean("employee",EmployeeImpl.class);
		e.setBasicPay(30000);
		e.setDa(30000);
		e.setHra(5000);
		e.setTax(5000);
//		e.display();
	}

}