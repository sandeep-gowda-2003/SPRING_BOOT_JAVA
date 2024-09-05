package com.infosys.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infosys.domain.Customers;
import com.infosys.domain.Loan;
import com.infosys.repository.CustomerRepository;
import com.infosys.repository.LoanRepository;

@Service
public class CustomerServiceImpl implements CustomerService{
	@Autowired
	CustomerRepository crepo;
	@Autowired
	LoanRepository lrepo;
	@Override
	public void getcustomerupdate(int creditpoints, int custid) {
		crepo.customerupdate(creditpoints, custid);
	}
	@Override
	public List<Customers> getCustomerdetails() {
		return crepo.findAll();
	}
	@Override
	public void getcustomerdelete(int customerid) {
		crepo.customerdelete(customerid);
	}
	@Override
	public List<Customers> getByEmail(String email) {
		return crepo.findByEmail(email);
	}
	@Override
	public List<Customers> getByCitydetails(String city) {
		return crepo.findByCitydetails(city);
	}
	@Override
	public List<Loan> getLoanstatus(String name) {
		return lrepo.findLoanstatus(name);
	}

}
