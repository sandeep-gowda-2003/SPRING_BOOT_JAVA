package com.infosys;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.infosys.domain.Address;
import com.infosys.domain.Employee;
import com.infosys.service.EmployeeService;
import com.infosys.service.EmployeeServiceImpl;

@SpringBootApplication
public class AssignmentOrmApplication implements CommandLineRunner{
	@Autowired
	EmployeeService es;
	public static void main(String[] args) {
		SpringApplication.run(AssignmentOrmApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
//		Employee e=new Employee(1,10,"sanjay","aiml","bengaluru");
//		Address a=new Address(10,"Bengaluru","323421");
//		es.add(e, a);
		
		
//		System.out.println(es.view(1));
		
//		for(Employee e:es.viewall()) {
//			System.out.println(e);
//		}
		
		
//		es.edit(1);
		
//		es.delete(1);
		
	} 

}
