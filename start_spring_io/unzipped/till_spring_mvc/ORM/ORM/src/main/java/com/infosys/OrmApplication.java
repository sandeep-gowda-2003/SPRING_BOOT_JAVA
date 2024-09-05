package com.infosys;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.infosys.Entity.EmployeeDTO;
import com.infosys.service.EmployeeService;

@SpringBootApplication
public class OrmApplication implements CommandLineRunner{

	@Autowired
	ApplicationContext context;
	public static void main(String[] args) {
		SpringApplication.run(OrmApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		EmployeeService employeeService = context.getBean("employeeService",EmployeeService.class);
		System.out.println("viewing all Employee details");
		ArrayList<EmployeeDTO> eList = (ArrayList<EmployeeDTO>)employeeService.getAll();
		for(EmployeeDTO employee:eList) {
			System.out.println(employee);
		}
		EmployeeDTO employee=new EmployeeDTO(2,2000,"kumar","sanjay");
		employeeService.insert(employee);
		ArrayList<EmployeeDTO> eList1 = (ArrayList<EmployeeDTO>)employeeService.getAll();
		for(EmployeeDTO employee1:eList1) {
			System.out.println(employee1);
		}
		int result = employeeService.remove(2);
		if(result==1) {
			System.out.println("successfully deleted");
		}
		else {
			System.out.println("record not found");
		}
		ArrayList<EmployeeDTO> eList2 = (ArrayList<EmployeeDTO>)employeeService.getAll();
		for(EmployeeDTO employee1:eList2) {
			System.out.println(employee1);
		}
		employeeService.update(1, "gowdaa");
		System.out.println("updated data");
		eList2 = (ArrayList<EmployeeDTO>)employeeService.getAll();
		for(EmployeeDTO employee1:eList2) {
			System.out.println(employee1);
		}
		
	}
}