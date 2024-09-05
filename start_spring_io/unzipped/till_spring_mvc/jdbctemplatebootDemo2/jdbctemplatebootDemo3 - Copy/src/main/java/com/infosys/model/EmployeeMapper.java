package com.infosys.model;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class EmployeeMapper implements RowMapper<Employee>{

	@Override
	public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
		Employee employee = new Employee();
		employee.setEmp_id(rs.getInt("emp_id"));
		employee.setEmp_name(rs.getString("emp_name"));
		employee.setEmp_desig(rs.getString("emp_desig"));
		employee.setEmp_sal(rs.getInt("emp_sal"));
		return employee;
	}
	
}
