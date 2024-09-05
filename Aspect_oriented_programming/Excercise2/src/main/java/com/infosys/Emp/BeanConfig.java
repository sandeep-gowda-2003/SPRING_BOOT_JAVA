package com.infosys.Emp;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import com.infosys.Emp.LoggingAspect;

@Configuration
@EnableAspectJAutoProxy
public class BeanConfig {
	@Bean
	public Employee employee() {
		return new Employee();
	}
	@Bean
	public LoggingAspect logaspect() {
		return new LoggingAspect();
	}
}
