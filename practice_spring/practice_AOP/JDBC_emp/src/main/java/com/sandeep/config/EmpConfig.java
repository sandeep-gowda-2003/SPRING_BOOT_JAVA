package com.sandeep.config;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;

@Configuration
@ComponentScan("com.sandeep.*")
public class EmpConfig {
	@Bean
	public BasicDataSource datasource() {
		BasicDataSource ds=new BasicDataSource();
		ds.setDriverClassName("org.postgresql.Driver");
		ds.setUrl("jdbc:postgresql://localhost:5432/java_spring");
		ds.setUsername("postgres");
		ds.setPassword("Sandeep@2003");
		return ds;
	}
	
	@Bean
	public JdbcTemplate jdbc_template(BasicDataSource db) {
		return new JdbcTemplate(db);
	}
}
