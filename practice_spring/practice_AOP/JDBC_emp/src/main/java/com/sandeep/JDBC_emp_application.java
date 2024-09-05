package com.sandeep;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.sandeep.config.EmpConfig;
import com.sandeep.dao.Emp_DAO;
import com.sandeep.model.Employee;

public class JDBC_emp_application {
	
	public static void main(String[] args) {
		ApplicationContext context=new AnnotationConfigApplicationContext(EmpConfig.class);
		Emp_DAO e=context.getBean(Emp_DAO.class);
		Employee e1=new Employee(2,2,"sandeep","aiml","bengaluru");
		System.out.println(e.insert(e1));
		List<Employee> l=e.fetch_all();
		for(Employee e2:l){
			System.out.println("data:"+e2);
		}
	}
}
