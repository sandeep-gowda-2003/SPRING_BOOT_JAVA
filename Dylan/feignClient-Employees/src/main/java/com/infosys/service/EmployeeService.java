package com.infosys.service;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.infosys.entity.Employee;
import com.infosys.feignclient.AddressClient;
import com.infosys.repository.EmployeeRepository;
import com.infosys.response.AddressResponse;
import com.infosys.response.EmployeeResponse;

@Service
public class EmployeeService {
	@Autowired
	private EmployeeRepository erep;
	
	@Autowired
	private ModelMapper mapper;
	
	@Autowired
	private AddressClient addressclient;
	
	public EmployeeResponse getEmployeeById(int id) {
		Employee emp=erep.findById(id).get();
		EmployeeResponse empres=mapper.map(emp, EmployeeResponse.class);
		ResponseEntity<AddressResponse> addressResponse=addressclient.getAddressByEmployeeId(id);
		empres.setAddresresponse(addressResponse.getBody());
		return empres;
	}
}
