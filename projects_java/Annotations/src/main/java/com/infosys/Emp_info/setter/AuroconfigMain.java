package com.infosys.Emp_info.setter;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AuroconfigMain {

	public static void main(String[] args) {
		ApplicationContext context = new
				ClassPathXmlApplicationContext("EmpConfig_setter.xml");
		Employee emp=context.getBean("employee",Employee.class);
		System.out.println(emp);
	}

}
