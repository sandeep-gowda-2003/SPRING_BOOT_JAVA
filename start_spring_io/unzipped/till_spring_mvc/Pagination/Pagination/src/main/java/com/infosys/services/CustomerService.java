package com.infosys.services;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import com.infosys.domain.Customer;

public interface CustomerService {
	Page<Customer> findAll(Pageable page);
	List<Customer> findAll(Sort sort);
}
