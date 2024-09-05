package com.infosys.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infosys.entity.Departments;
import com.infosys.repository.DepartmentRepository;

@Service
public class DepartmentServiceImpl implements DepartmentService{

	@Autowired
	private DepartmentRepository drepository;
	@Override
	public Departments saveDepartment(Departments department) {
		return drepository.save(department);
	}

	@Override
	public Departments getDepartmentById(Long departmentid) {
		return drepository.findById(departmentid).get();
	}

}
