package com.infosys.Annotation_DependsOn;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainTest {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		FirstBean fb=context.getBean("firstBean",FirstBean.class);
		fb.populatebeans();
	}

}
