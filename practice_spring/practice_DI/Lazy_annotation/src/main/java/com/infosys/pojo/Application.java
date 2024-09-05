package com.infosys.pojo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		FirstBean fb= context.getBean("firstBean",FirstBean.class);
		fb.test();
	}

}
