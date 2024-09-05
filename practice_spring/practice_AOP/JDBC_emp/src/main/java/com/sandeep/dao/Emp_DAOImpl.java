package com.sandeep.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.sandeep.model.Employee;
import com.sandeep.model.EmployeeMapper;

@Component
public class Emp_DAOImpl implements Emp_DAO{
	
	@Autowired
	private JdbcTemplate jdbc_temp;

	@Override
	public List<Employee> fetch_all() {
		List<Employee> e= jdbc_temp.query("select * from employee_jpa", new EmployeeMapper());
		return e;
	}

	@Override
	public boolean insert(Employee e) {
		return jdbc_temp.update("insert into employee_jpa values(?,?,?,?,?);",e.getEmp_id(),e.getEmp_name(),e.getDepartment(),e.getBase_location(),e.getAddress())>0;
	}
	
}
