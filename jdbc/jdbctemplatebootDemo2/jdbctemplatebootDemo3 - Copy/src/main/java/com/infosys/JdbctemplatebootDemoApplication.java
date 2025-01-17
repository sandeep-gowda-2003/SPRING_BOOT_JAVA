package com.infosys;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.dao.DataAccessException;

import com.infosys.config.AppConfig;
import com.infosys.dao.EmployeesDAO;
import com.infosys.model.Employee;

@SpringBootApplication
public class JdbctemplatebootDemoApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(JdbctemplatebootDemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		
	}

}
