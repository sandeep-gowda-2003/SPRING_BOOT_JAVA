package com.infosys.model;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class FlightCustomerMapper implements RowMapper<FlightCustomer>{

	@Override
	public FlightCustomer mapRow(ResultSet rs, int rowNum) throws SQLException {
		FlightCustomer fc = new FlightCustomer();
		fc.setCustomer_id(rs.getInt("customer_id"));
		fc.setFirstname(rs.getString("first_name"));
		fc.setLastname(rs.getString("last_name"));
		fc.setPnr(rs.getString("pnr_no"));
		fc.setSeatno(rs.getString("seat_no"));
		return fc;
	}

}
