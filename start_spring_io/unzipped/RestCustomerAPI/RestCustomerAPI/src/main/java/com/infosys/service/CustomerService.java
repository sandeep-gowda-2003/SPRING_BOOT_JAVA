package com.infosys.service;

import java.util.List;

import com.infosys.entity.Customer;

public interface CustomerService {
	List<Customer> fetchAll();
	Customer getById(Integer cid);
	Customer save(Customer customer);
	String DeleteById(Integer cid);
	List<Customer> fetchCustomerDetails(Integer custid,String fname);
	void update(String fname,String lname,String email,String contactnumber,Boolean active,Integer creditpoints,Integer custid);
	
}
