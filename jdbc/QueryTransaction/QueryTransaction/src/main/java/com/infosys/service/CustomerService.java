package com.infosys.service;

import java.util.List;

import com.infosys.domain.Customers;
import com.infosys.domain.Loan;

public interface CustomerService {
	public void getcustomerupdate(int creditpoints,int custid);
	public List<Customers> getCustomerdetails();
	public void getcustomerdelete(int customerid);
	public List<Customers> getByEmail(String email);
	public List<Customers> getByCitydetails(String city);
	public List<Loan> getLoanstatus(String name);

}
