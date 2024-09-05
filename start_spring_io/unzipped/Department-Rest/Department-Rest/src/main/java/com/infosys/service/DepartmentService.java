package com.infosys.service;

import com.infosys.entity.Departments;

public interface DepartmentService {
	Departments saveDepartment(Departments department);
	Departments getDepartmentById(Long departmentid);
}
