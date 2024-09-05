package com.infosys.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infosys.entity.Employee;
import com.infosys.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService{

	@Autowired
	EmployeeRepository employeeRepository;
	
	@Override
	public List<Employee> getAll() {
		return employeeRepository.findAll();
	}
	
	@Override
	public Employee getBydeets(Integer empid,String name) {
		return employeeRepository.findByEmpidAndName(empid, name);
	}
	
	@Override
	public Employee getById(Integer id) {
		return employeeRepository.findById(id).get();
	}
	
	@Override
	public Employee addEmp(Employee employee) {
		employeeRepository.save(employee);
		return employee;
	}
	
	@Override
	public void delete(Employee employee) {
		employeeRepository.delete(employee);
	}
	
	@Override
	public Employee updateEmployee(Employee employee,Integer id) {
		employeeRepository.updateEmployee(employee.getName(), employee.getDesignation(), employee.getSalary(), id);
		Employee employee2 = employeeRepository.findById(id).get();
		return employee2;
	}
}
