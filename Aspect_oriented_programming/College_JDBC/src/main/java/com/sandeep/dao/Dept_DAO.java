package com.sandeep.dao;

import java.util.List;

import org.springframework.stereotype.Component;

import com.sandeep.model.Depart_HOD;
import com.sandeep.model.Department;

@Component
public interface Dept_DAO {
	public boolean addDepartment(Depart_HOD d);
	public Depart_HOD searchDept(Depart_HOD d);
	public List<Department> list_dept();
	public boolean updateNames(String D_name,Integer D_id,String H_name);
	public boolean deleteDepartment(int dept_id);
}
