package com.infosys.pojo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ImportResource("classpath:/config.xml")
public class AppConfig {
	@Bean
	public EmailService emailService() {
		EmailService eservice=new EmailService();
		eservice.setMessage("Email Message");
		eservice.setType("Email");
		return eservice;
	}
	
	
}
