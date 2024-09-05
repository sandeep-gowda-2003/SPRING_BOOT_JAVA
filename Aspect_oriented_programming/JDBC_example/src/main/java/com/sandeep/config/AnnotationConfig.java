package com.sandeep.config;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;

@Configuration
public class AnnotationConfig {
	@Bean
	public BasicDataSource dbConn() {
		BasicDataSource db= new BasicDataSource();
		db.setUsername("postgre");
		db.setPassword("Sandeep@2003");
		db.setDriverClassName("org.postgresql.Driver");
		db.setUrl("jdbc:postgre://localhost:5432/java_spring");
		return db;
	}
	
	@Bean
	public JdbcTemplate jdbc_temp(BasicDataSource db) {
		return new JdbcTemplate(db);
	}
}
