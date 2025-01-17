package com.practice.service;

import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.practice.entity.Address;
import com.practice.repository.AddressRepository;
import com.practice.response.AddressResponse;

@Service
public class AddressService {
	@Autowired
	private AddressRepository repo;
	
	@Autowired
	private ModelMapper mapper;
	
	public ResponseEntity<Address> insert(Address a) {
		Address a1=repo.saveAndFlush(a);
		return new ResponseEntity<Address>( a1,HttpStatus.ACCEPTED);
	}

	public AddressResponse fetchbyId(Integer id) {
		Optional<Address> a=repo.findById(id);
		AddressResponse a1=mapper.map(a.get(), AddressResponse.class);
		return a1;
	}
	public AddressResponse updatebyId(Integer id,String city,String state) {
		Optional<Address> a=repo.findById(id);
		Address a1=a.get();
		a1.setCity(city);
		a1.setState(state);
		a1=repo.save(a1);
		AddressResponse a2=mapper.map(a1, AddressResponse.class);
		return a2;
	}
	
}
