package com.infosys.service;

import java.util.List;

import com.infosys.domain.Address;
import com.infosys.domain.Employee;

public interface EmployeeService {
	public void add(Employee e,Address a);
	public Employee view(int id);
	public List<Employee> viewall();
	public void edit(int id);
	public void delete(int id);
}
