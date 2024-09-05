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
		EmployeesDAO emplDAO = context.getBean(EmployeesDAO.class);
		System.out.println("List of Employees are ");
		for(Employee e:emplDAO.getAllEmployees()) {
			System.out.println(e);
		}
		System.out.println("inserting employee details");
		Employee employee = new Employee(2,"rahul","QA",5000);
		try {
			emplDAO.createEmployee(employee);	
		}
		catch (DataAccessException e) {
			System.out.printf(e.getMessage(),e);
		}
		for(Employee e:emplDAO.getAllEmployees()) {
			System.out.println(e);
		}
		
		int e1=1;
		System.out.println("deleting employee details");
		try {
			emplDAO.deleteEmployee(e1);
		}
		catch (DataAccessException e) {
			System.out.printf(e.getMessage(),e);
		}
		for(Employee e:emplDAO.getAllEmployees()) {
			System.out.println(e);
		}
				
	}

}
