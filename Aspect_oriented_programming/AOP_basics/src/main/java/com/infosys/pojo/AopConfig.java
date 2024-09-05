package com.infosys.pojo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@EnableAspectJAutoProxy
@Configuration
public class AopConfig {
	@Bean
	public CustomerImpl customer() {
		return new CustomerImpl();
	}
	@Bean
	public LoggingAspect logaspect() {
		return new LoggingAspect();
	}
}
