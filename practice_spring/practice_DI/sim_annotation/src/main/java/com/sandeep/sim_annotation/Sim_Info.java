package com.sandeep.sim_annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Sim_Info {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(Annotation_config.class);
		Sim s = (Sim) context.getBean("Jio");
		s.calling();
	}

}
