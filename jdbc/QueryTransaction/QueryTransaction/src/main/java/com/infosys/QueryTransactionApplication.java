package com.infosys;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.infosys.domain.Customers;
import com.infosys.domain.Loan;
import com.infosys.service.CustomerService;

@SpringBootApplication
public class QueryTransactionApplication implements CommandLineRunner {
	@Autowired
	CustomerService service;
	public static void main(String[] args) {
		SpringApplication.run(QueryTransactionApplication.class, args);
	}
	@Override
	public void run(String... args) throws Exception {
		for (Customers c:service.getCustomerdetails()) {
			System.out.println(c);
		}
//		service.getcustomerupdate(9,1);
//		System.out.println("updated customer id 1 successfully");
//		for (Customers c:service.getCustomerdetails()) {
//			System.out.println(c);
//		}
		
//		service.getcustomerdelete(2);
//		System.out.println("deleted customer id 2 successfully");
//		for (Customers c:service.getCustomerdetails()) {
//			System.out.println(c);
//		}
		
//		
//		System.out.println("find email");
//		for (Customers c:service.getByEmail("sandeeppp0001@gmail.com")) {
//			System.out.println(c);
//		}
//		
//		System.out.println("customers details bengaluru");
//		for (Customers c:service.getByCitydetails("bengaluru")) {
//			System.out.println(c);
//		}
		
		System.out.println("Loan details for customer");
		for (Loan l:service.getLoanstatus("sandeep")) {
			System.out.println(l);
		}
		
	}

}
