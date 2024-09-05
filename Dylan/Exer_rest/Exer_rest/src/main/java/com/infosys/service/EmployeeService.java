package com.infosys.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.infosys.entity.Employee;

@Service
public interface EmployeeService {

 	public List<Employee> getAll();

 	public Employee getBydeets(Integer empid, String name);

 	public Employee getById(Integer id);

 	public Employee addEmp(Employee employee);

 	public void delete(Employee employee);

 	public Employee updateEmployee(Employee employee, Integer empid);

}
