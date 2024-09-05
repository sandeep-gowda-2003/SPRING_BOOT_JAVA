package com.infosys.Annotation_types;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class EmployeeConfig {
	@Bean
	public Address address() {
		Address a= new Address("Bengaluru","karnataka");
		return a;
	}
	
	@Bean
	public Employee employee() {
		Employee e = new Employee(11,"sandy",address());
		return e;
	}
}
