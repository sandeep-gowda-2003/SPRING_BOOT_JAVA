package com.sandeep.dao;

import java.util.List;

import com.sandeep.model.Employee;

public interface Emp_DAO {
	public List<Employee> fetch_all();
	public boolean insert(Employee e);
}