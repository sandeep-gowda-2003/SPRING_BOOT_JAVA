package com.infosys.customer1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfiguration {
	
	@Bean(name="customerService")
	public CustomerServiceImpl customerServiceImpl() {
		return new CustomerServiceImpl();
	}
}

//annotation