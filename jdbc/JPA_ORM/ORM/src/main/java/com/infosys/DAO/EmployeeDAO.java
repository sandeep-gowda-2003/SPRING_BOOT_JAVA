package com.infosys.DAO;

import java.util.List;

import com.infosys.Entity.Employee;

public interface EmployeeDAO {
	public List<Employee> getAll();
	public void insert(Employee employee);
	public int remove(int id);
	public void update(int id,String last_name);
}
 