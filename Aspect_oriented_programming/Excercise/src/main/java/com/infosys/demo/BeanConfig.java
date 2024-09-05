package com.infosys.demo;

import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy
public class BeanConfig {
	@Bean
	public Bank bank() {
		return new Bank();
	}
	
	@Bean
	public LoggingAspect logAspect() {
		return new LoggingAspect();
	}
}
