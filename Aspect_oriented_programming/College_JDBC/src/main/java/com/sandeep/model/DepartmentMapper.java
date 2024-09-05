package com.sandeep.model;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class DepartmentMapper implements RowMapper<Department>{

	@Override
	public Department mapRow(ResultSet rs, int rowNum) throws SQLException {
		Department d = new Department();
		d.setDept_id(rs.getInt("dept_id"));
		d.setDept_name(rs.getString("dept_name"));
		d.setDept_intake(rs.getInt("dept_intake"));
		d.setDept_duration(rs.getInt("dept_duration"));
		return d;
	}
	
}
