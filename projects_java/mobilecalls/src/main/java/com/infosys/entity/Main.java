package com.infosys.entity;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context= new
				ClassPathXmlApplicationContext("config.xml");
		Sim sim1=context.getBean("sim",Sim.class);
		sim1.calldata();
		sim1.calling();
	}

}
