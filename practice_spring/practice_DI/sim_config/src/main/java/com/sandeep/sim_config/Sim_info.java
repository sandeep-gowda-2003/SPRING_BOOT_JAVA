package com.sandeep.sim_config;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Sim_info {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
		Sim sim = (Jio) context.getBean("sim");
		sim.calling();
	}

}
