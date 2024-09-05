package com.infosys.model;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class CustomerMapper implements RowMapper<Customer>{

	@Override
	public Customer mapRow(ResultSet rs, int rowNum) throws SQLException {
		Customer c=new Customer();
		c.setCustomer_id(rs.getInt("customer_id"));
		c.setMobile_no(rs.getLong("mobile_no"));
		c.setFirst_name(rs.getString("first_name"));
		c.setLast_name(rs.getString("last_name"));
		c.setEmail(rs.getString("email"));
		
		return c;
	}

}
