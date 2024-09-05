package com.infosys.service;

import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infosys.entity.Address;
import com.infosys.repository.AddressRepository;
import com.infosys.response.AddressResponse;

@Service
public class AddressService
{

	@Autowired
	private AddressRepository addressRepository;
	
	@Autowired
	private ModelMapper mapper;
	
	public AddressResponse findAddressByEmployeeId(int id) {
		Optional<Address> addOptional = addressRepository.findById(id);
		AddressResponse addressResponse = mapper.map(addOptional, AddressResponse.class);
		return addressResponse;
	}
}
