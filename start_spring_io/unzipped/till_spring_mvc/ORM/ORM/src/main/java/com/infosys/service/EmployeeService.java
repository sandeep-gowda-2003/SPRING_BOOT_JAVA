package com.infosys.service;

import java.util.List;

import com.infosys.Entity.EmployeeDTO;

public interface EmployeeService {
	public List<EmployeeDTO> getAll();
	public void insert(EmployeeDTO employee);
	public int remove(int id);
	public void update(int id,String last_name);
}
