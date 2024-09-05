package com.infosys.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infosys.domain.Customers;
import com.infosys.repository.AddressRepository;
import com.infosys.repository.CustomerRepository;

@Service
public class CustomersServiceImpl implements CustomersService{

	@Autowired
	CustomerRepository crepo;
	@Autowired
	AddressRepository arepo;
	
	@Override
	public Iterable<Customers> getByEmail(String email) {
		return crepo.findByEmail(email);
	}

	@Override
	public List<Customers> getByActiveTrue() {
		return crepo.findByActiveTrue();
		
	}

	@Override
	public List<Customers> getByCreditpointsGreaterThanEqual(int points) {
		return crepo.findByCreditpointsGreaterThanEqual(points);
	}

	@Override
	public List<Customers> getByCreditpointsBetween(int point1, int point2) {
		return crepo.findByCreditpointsBetween(point1, point2);
	}

	@Override
	public List<Customers> getByLastnameOrderByFirstnameAsc(String lastname) {
		return crepo.findByLastnameOrderByFirstnameAsc(lastname);
	}

	@Override
	public List<Customers> getByEmailAndContactnumber(String email, String contactno) {
		return crepo.findByEmailAndContactnumber(email, contactno);
	}

}
