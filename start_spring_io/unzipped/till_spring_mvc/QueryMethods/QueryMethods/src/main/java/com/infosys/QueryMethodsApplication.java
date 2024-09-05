package com.infosys;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.infosys.domain.Customers;
import com.infosys.service.CustomersService;

@SpringBootApplication
public class QueryMethodsApplication implements CommandLineRunner{

	@Autowired
	CustomersService service;
	public static void main(String[] args) {
		SpringApplication.run(QueryMethodsApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Iterable<Customers> cus=service.getByEmail("sandeep@gmail.com");
		for(Customers clist:cus) {
			System.out.println(clist);
		}
		
		System.out.println("Searching through active status");
		Iterable<Customers> cus1=service.getByActiveTrue();
		for(Customers clist:cus1) {
			System.out.println(clist);
		}
		
		System.out.println("Searching through credit points");
		Iterable<Customers> cus2=service.getByCreditpointsGreaterThanEqual(9);
		for(Customers clist:cus2) {
			System.out.println(clist);
		}
		
		System.out.println("Serchint in range");
		Iterable<Customers> cus3=service.getByCreditpointsBetween(9,10);
		for(Customers clist:cus3) {
			System.out.println(clist);
		}
		
		System.out.println("order by");
		Iterable<Customers> cus4=service.getByLastnameOrderByFirstnameAsc("gowda");
		for(Customers clist:cus4) {
			System.out.println(clist);
		}
		
		System.out.println("find using and");
		Iterable<Customers> cus5=service.getByEmailAndContactnumber("sandeep@gmail.com","9887987");
		for(Customers clist:cus5) {
			System.out.println(clist);
		}
		
	}

}
