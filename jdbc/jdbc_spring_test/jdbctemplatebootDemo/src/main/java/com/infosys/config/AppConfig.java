package com.infosys.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;


@ComponentScan("com.infosys")
@Configuration
@PropertySource("database.properties")
public class AppConfig {

	@Autowired
	Environment environment;
	private final String URL="url";
	private final String USER="dbuser";
	private final String DRIVER="driver";
	private final String PASSWORD="dbpassword";
	
	@Bean
	DataSource dataSource() {
		DriverManagerDataSource driverManagerDS=new DriverManagerDataSource();
		driverManagerDS.setUrl(environment.getProperty(URL));
		driverManagerDS.setUsername(environment.getProperty(USER));
		driverManagerDS.setPassword(environment.getProperty(PASSWORD));
		driverManagerDS.setDriverClassName(environment.getProperty(DRIVER));
		return driverManagerDS;
	}
	
	@Bean
	public JdbcTemplate myjdbctemplate(DataSource datasource) {
		return new JdbcTemplate(datasource);
	}

}

//customer table
//firstname lastname pnr flightname seatno
//
//flight table
//pnr flightname source destination
//
//,