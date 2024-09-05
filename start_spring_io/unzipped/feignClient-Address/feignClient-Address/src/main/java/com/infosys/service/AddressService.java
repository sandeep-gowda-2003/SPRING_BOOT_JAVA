package com.infosys.service;

import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;

import com.infosys.entity.Address;
import com.infosys.repository.AddressRepository;
import com.infosys.response.AddressResponse;

public class AddressService {

	@Autowired
	private AddressRepository addressRepository;
	
	@Autowired
	private ModelMapper mapper;
	
	public AddressResponse findAddressByEmployeeId(int empid) {
		Optional<Address> addOptional = addressRepository.findById(empid);
		AddressResponse addressResponse = mapper.map(addOptional, AddressResponse.class);
		return addressResponse;
	}
}
