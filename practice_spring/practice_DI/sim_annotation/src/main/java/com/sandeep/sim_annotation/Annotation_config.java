package com.sandeep.sim_annotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Annotation_config {
	@Bean
	public Sim Jio() {
		return new Jio();
	}
	
	@Bean(name="airtel")
	public Sim Airtel() {
		return new Airtel();
	}
}
