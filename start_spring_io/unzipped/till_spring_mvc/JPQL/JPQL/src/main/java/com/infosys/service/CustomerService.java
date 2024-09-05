package com.infosys.service;

import java.util.List;

import com.infosys.domain.Customers;
import com.infosys.dto.Customersdto;

public interface CustomerService {
	public List<Customers> getallCustomerdetails();
	public List<Customersdto> getallCustomerdetailsDTO();
	
	public List<Object[]> getallCustomerbyfirstnameAndemail();
	
	public List<Customers> getCustomerdetailsbyId(Integer id);

	public List<Customers> getdetailedCustomerdetails();
	
	public Integer updateLastnameofCustomer(Integer id , String lastname);
	
	public Integer deleteCustomer(String email);

	public List<Object[]> getCustomerCountforactive();

	public Double getAverageCredits();

}
