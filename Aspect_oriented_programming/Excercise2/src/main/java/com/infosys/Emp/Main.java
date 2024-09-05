package com.infosys.Emp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(BeanConfig.class);
		Employee obj=context.getBean("employee",Employee.class);
		obj.setBasicPay(10000);
		obj.setDa(15000);
		obj.setEmpNumber(10902);
		obj.setHra(5000);
		obj.setTax(200);
		obj.display();
		obj.grossSalary();
		obj.netSalary();
	}

}
