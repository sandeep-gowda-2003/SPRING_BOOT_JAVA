package com.sandeep.model;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class Hod_mapper implements RowMapper<Hod>{

	@Override
	public Hod mapRow(ResultSet rs, int rowNum) throws SQLException {
		Hod h=new Hod();
		h.setHod_id(rs.getInt("hod_id"));
		h.setHod_name(rs.getString("hod_name"));
		h.setHod_experience(rs.getInt("hod_experience"));
		h.setHod_incharge_date(rs.getDate("hod_incharge_date"));
		return h;
	}
	
}
