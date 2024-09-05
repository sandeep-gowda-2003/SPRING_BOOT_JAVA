package com.infosys.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.infosys.domain.Customer;
import com.infosys.repository.CustomerRepository;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	private CustomerRepository repository;
	
	@Override
	public Page<Customer> findAll(Pageable page) {
		return repository.findAll(page);
	} 

	@Override
	public List<Customer> findAll(Sort sort) {
		return repository.findAll(sort);
	}

}
