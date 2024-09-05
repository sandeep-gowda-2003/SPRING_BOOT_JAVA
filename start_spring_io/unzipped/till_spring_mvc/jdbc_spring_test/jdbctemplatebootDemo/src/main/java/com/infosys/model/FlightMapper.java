package com.infosys.model;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class FlightMapper implements RowMapper<Flight>{

	@Override
	public Flight mapRow(ResultSet rs, int rowNum) throws SQLException {
		Flight f=new Flight();
		f.setPnr_no(rs.getString("pnr_no"));
		f.setFlight_name(rs.getString("flight_name"));
		f.setF_source(rs.getString("f_source"));
		f.setF_destination(rs.getString("f_destination"));
		return f;
	}

}
