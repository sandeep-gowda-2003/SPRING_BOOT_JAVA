package com.infosys.repository;

import java.util.List;

import com.infosys.domain.Customers;
import com.infosys.dto.Customersdto;

public interface CustomerRepository {
	public List<Customers> getCustomerdetails();
	
	public List<Customersdto> getCustomerdetailsDTO();
	
	public List<Object[]> getCustomerbyfirstnameAndemail();
	
	public List<Customers> getCustomerdetailsbyId(Integer id);
	
	public List<Customers> getfullCustomerdetails();
	
	public Integer updateLastnameofCustomer(Integer id , String lastname);
	
	public Integer deleteCustomer(String email);
	
	public List<Object[]> getCustomerCountforactive();
	
	public Double getAverageCredits();
}
