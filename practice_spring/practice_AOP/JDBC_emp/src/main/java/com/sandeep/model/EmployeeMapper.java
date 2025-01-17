package com.sandeep.model;

import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.tree.RowMapper;

public class EmployeeMapper implements org.springframework.jdbc.core.RowMapper<Employee>{

	@Override
	public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
		Employee e=new Employee();
		e.setEmp_id(rs.getInt("emp_id"));
		e.setEmp_name(rs.getString("emp_name"));
		e.setDepartment(rs.getString("department"));
		e.setBase_location(rs.getString("base_location"));
		e.setAddress(rs.getInt("address"));
		return e;
	}

}
