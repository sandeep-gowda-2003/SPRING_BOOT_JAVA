package com.infosys.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infosys.DAO.EmployeeDAO;
import com.infosys.Entity.Employee;
import com.infosys.Entity.EmployeeDTO;

@Service("employeeService")
public class EmployeeServiceImpl implements EmployeeService{

	@Autowired
	EmployeeDAO employeeDAO;
	
	@Override
	public List<EmployeeDTO> getAll() {
		List<EmployeeDTO> empList=new ArrayList<>();
		List<Employee> EmpEntityList = employeeDAO.getAll();
		for(Employee employeeEntity: EmpEntityList) {
			EmployeeDTO empDTO= Employee.prepareDTO(employeeEntity);
			empList.add(empDTO);
		}
		return empList;
	}

	@Override
	public void insert(EmployeeDTO employee) {
		employeeDAO.insert(EmployeeDTO.prepareEmployeeEntity(employee));
		
	}

	@Override
	public int remove(int id) {
		return employeeDAO.remove(id);
	}

	@Override
	public void update(int id, String last_name) {
		employeeDAO.update(id, last_name);
	}

}
