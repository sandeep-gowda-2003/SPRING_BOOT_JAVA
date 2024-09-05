package com.infosys.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infosys.domain.Customers;
import com.infosys.dto.Customersdto;
import com.infosys.repository.CustomerRepository;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class CustomersServiceImpl implements CustomerService{

	@Autowired
	CustomerRepository customerrepo;
	
	@Override
	public List<Customers> getallCustomerdetails() {
		return customerrepo.getCustomerdetails();
	}

	//this is using customerdto indirectly
	@Override
	public List<Customersdto> getallCustomerdetailsDTO() {
		return customerrepo.getCustomerdetailsDTO();
	}

	@Override
	public List<Object[]> getallCustomerbyfirstnameAndemail() {
		return customerrepo.getCustomerbyfirstnameAndemail();
	}

	@Override
	public List<Customers> getCustomerdetailsbyId(Integer id) {
		return customerrepo.getCustomerdetailsbyId(id);
	}

	@Override
	public List<Customers> getdetailedCustomerdetails() {
		return customerrepo.getfullCustomerdetails();
	}

	@Override
	public Integer updateLastnameofCustomer(Integer id, String lastname) {
		return customerrepo.updateLastnameofCustomer(id, lastname);
	}

	@Override
	public Integer deleteCustomer(String email) {
		return customerrepo.deleteCustomer(email);
	}

	@Override
	public List<Object[]> getCustomerCountforactive() {
		return customerrepo.getCustomerCountforactive();
	}

	@Override
	public Double getAverageCredits() {
		return customerrepo.getAverageCredits();
	}
}
