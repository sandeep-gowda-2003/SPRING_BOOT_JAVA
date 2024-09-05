package com.sandeep.config;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;


@Configuration
@ComponentScan("com.sandeep")
@Component
public class JdbcConfig {
	@Bean
	public BasicDataSource dbConn() {
		BasicDataSource dbs=new BasicDataSource();
		dbs.setDriverClassName("org.postgresql.Driver");
		dbs.setUrl("jdbc:postgresql://localhost:5432/java_spring");
		dbs.setUsername("postgres");
		dbs.setPassword("Sandeep@2003");
		return dbs;
	}
	
	@Bean
	public JdbcTemplate myjdbcTemplate(BasicDataSource ds) {
		return new JdbcTemplate(ds);
	}
}
