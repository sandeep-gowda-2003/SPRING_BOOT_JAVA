package com.infosys.config;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LibraryConfig {
	@Bean
	public ModelMapper mapper() {
		return new ModelMapper();
	}


}
