package com.infosys.dao;

import java.util.List;

import com.infosys.model.Employee;

public interface EmployeesDAO {
	public List<Employee> getAllEmployees();
	public boolean createEmployee(Employee employee);
	public boolean deleteEmployee(int employee);
}
