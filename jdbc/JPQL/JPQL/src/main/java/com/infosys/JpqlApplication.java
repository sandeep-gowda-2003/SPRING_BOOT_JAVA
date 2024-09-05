package com.infosys;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.infosys.domain.Customers;
import com.infosys.dto.Customersdto;
import com.infosys.service.CustomerService;

@SpringBootApplication
public class JpqlApplication implements CommandLineRunner{

	@Autowired
	CustomerService cservice;
	
	public static void main(String[] args) {
		SpringApplication.run(JpqlApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
//		getcustomerdetails();
//		getCustomerNameAndEmail();
//		getdetailedcustomerdetails();
		
//		getCustomerdetailsusingid(1);
//		updateLastnamebyid(1, "gowdaa");
//		getCustomerdetailsusingid(1);
		
//		getcustomerdetails();
//		deletebyemail("manoj@gmail.com");
//		getcustomerdetails();
		
//		getCustomersgroupby();
		
		getCustomeraggregateCredits();
	}

	public void getcustomerdetails() {
		
		//if you want to use Customers class that is directly
		
//		System.out.println("Printing all details using Customer class");
//		List<Customers> c=cservice.getallCustomerdetails();
//		for(Customers i:c) {
//			System.out.println(i);
//		}  
		
		
		//if you want to use Customersdto class that is indirectly
		System.out.println("printing all details using Customerdto");	
		List<Customersdto> c1=cservice.getallCustomerdetailsDTO();
		for(Customersdto i:c1) {
			System.out.println(i);
		}
	}
	
	public void getCustomerNameAndEmail() {
		List<Object[]> customer=cservice.getallCustomerbyfirstnameAndemail();
		for(Object[] object:customer) {
			System.out.println(object[0]+"\t"+object[1]);
		}
	}
	public void getCustomerdetailsusingid(Integer id) {
		List<Customers> customer=cservice.getCustomerdetailsbyId(id);
		System.out.println("details of customer "+id);
		for(Customers object:customer) {
			System.out.println(object);
		}
	}
	public void getdetailedcustomerdetails() {
		List<Customers> customer=cservice.getdetailedCustomerdetails();
		System.out.println("details of customer ");
		for(Customers object:customer) {
			System.out.println(object);
		}
		
	}
	public void updateLastnamebyid(int id,String lastname) {
		System.out.println(cservice.updateLastnameofCustomer(id, lastname)+" updated successfully");
	}
	public void deletebyemail(String email) {
		System.out.println(cservice.deleteCustomer(email)+" deleted successfully");
	}
	public void getCustomersgroupby() {
		List<Object[]> o=cservice.getCustomerCountforactive();
		System.out.println("customer count for activities");
		for(Object[] o1:o) {
			System.out.println(o1[0]+"\t"+o1[1]);
		}
	}
	public void getCustomeraggregateCredits() {
		System.out.println("the average credits is "+cservice.getAverageCredits());
	}
}
