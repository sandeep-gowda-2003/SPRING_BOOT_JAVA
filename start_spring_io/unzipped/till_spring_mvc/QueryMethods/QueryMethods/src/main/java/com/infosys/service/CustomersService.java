package com.infosys.service;

import java.util.List;

import com.infosys.domain.Customers;

public interface CustomersService {
	public Iterable<Customers> getByEmail(String email);
	public List<Customers> getByActiveTrue();
	public List<Customers> getByCreditpointsGreaterThanEqual(int points);
	public List<Customers> getByCreditpointsBetween(int point1,int point2);
	public List<Customers> getByLastnameOrderByFirstnameAsc(String lastname);
	public List<Customers> getByEmailAndContactnumber(String email,String contactno);


}
