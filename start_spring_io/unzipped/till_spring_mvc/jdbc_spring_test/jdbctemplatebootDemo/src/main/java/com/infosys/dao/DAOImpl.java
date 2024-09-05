package com.infosys.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.infosys.model.Customer;
import com.infosys.model.Flight;
import com.infosys.model.FlightCustomer;
import com.infosys.model.FlightCustomerMapper;
import com.infosys.model.FlightMapper;

@Component 
public class DAOImpl implements DAO{
	
	private String SQL_QUERY_FLIGHT="select * from flight where f_destination=?";
	private String SQL_BOOK_FLIGHT="insert into flight_customer values(?,?,?,?,?)";
	private String SQL_DELETE_BOOKING="delete from flight_customer where customer_id=?";
	private String SQL_UPDATE_CUSTOMER="update customer set email=?,mobile_no=? where customer_id=?";
	private String SQL_QUERY_BOOKED="select * from flight_customer where customer_id=?";
	
	@Autowired
	JdbcTemplate template;
	
	@SuppressWarnings("deprecation")
	public List<Flight> displayFlights(String dest){
		return template.query(SQL_QUERY_FLIGHT,new Object[] {dest},new FlightMapper());
	}

	@Override
	public boolean bookFlight(FlightCustomer fc) {
		
		return template.update(SQL_BOOK_FLIGHT,fc.getPnr(),fc.getFirstname(),fc.getLastname(),fc.getCustomer_id(),fc.getSeatno())>0;
	}

	@Override
	public boolean deleteBooking(int id) {
		
		return template.update(SQL_DELETE_BOOKING,id)>0;
	}

	@Override
	public boolean updateCustomer(Customer c,int id) {
		
		return (template.update(SQL_UPDATE_CUSTOMER,c.getEmail(),c.getMobile_no(),id)>0 );
	}

	@Override
	public List<FlightCustomer> displayBookedFlights(int id) {
		return template.query(SQL_QUERY_BOOKED,new Object[] {id} ,new FlightCustomerMapper());
	}
}
