package com.sandeep.model;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class DeptHod_mapper implements RowMapper<Depart_HOD>{

	@Override
	public Depart_HOD mapRow(ResultSet rs, int rowNum) throws SQLException {
		Depart_HOD d = new Depart_HOD();
		d.setDept_id(rs.getInt("dept_id"));
		d.setDept_name(rs.getString("dept_name"));
		d.setDept_intake(rs.getInt("dept_intake"));
		d.setDept_duration(rs.getInt("dept_duration"));
		d.setHod_id(rs.getInt("hod_id"));
		d.setHod_id(rs.getInt("hod_id"));
		d.setHod_name(rs.getString("hod_name"));
		d.setHod_experience(rs.getInt("hod_experience"));
		d.setHod_incharge_date(rs.getDate("hod_incharge_date"));
		return d;
	}

}
