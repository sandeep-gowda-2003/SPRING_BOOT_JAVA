package com.sandeep;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@EnableAspectJAutoProxy
@Configuration
public class EmpConfig {
	@Bean
	public EmployeeImpl employee() {
		return new EmployeeImpl();
	}
	
	@Bean
	public LoggingAspect aspect() {
		return new LoggingAspect();
	}
	
}
