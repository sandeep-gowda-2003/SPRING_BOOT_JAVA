package com.infosys;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import com.infosys.domain.Customer;
import com.infosys.repository.CustomerRepository;
import com.infosys.services.CustomerService;

@SpringBootApplication
public class PaginationApplication implements CommandLineRunner{

	@Autowired
	CustomerService service;
	
	@Autowired
	CustomerRepository repository;
	
	public static void main(String[] args) {
		SpringApplication.run(PaginationApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		int k=(int)(repository.count()/3);
		for(int i=0;i<=k;i++)
		{
			Pageable page=PageRequest.of(i, 2);
			System.out.println("Records are");
			Iterable<Customer> cust=service.findAll(page);
			for(Customer clist:cust) {
				System.out.println(clist);
			}
		}
		
		System.out.println("Sorted records are");
		Iterable<Customer> cust1=service.findAll(Sort.by(Sort.Direction.ASC,"name"));
		for(Customer alist:cust1) {
			System.out.println(alist);
		}
	}

}
