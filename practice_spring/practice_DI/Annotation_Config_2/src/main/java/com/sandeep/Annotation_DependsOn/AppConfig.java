package com.sandeep.Annotation_DependsOn;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;

@Configuration
public class AppConfig {
	
	@Bean
	@DependsOn(value= {"secondBean","thirdBean"})
	public FirstBean firstBean() {
		return new FirstBean();
	}
	@Bean
	public SecondBean secondBean() {
		return new SecondBean();
	}
	@Bean
	public ThirdBean thirdBean() {
		return new ThirdBean();
	}
}
