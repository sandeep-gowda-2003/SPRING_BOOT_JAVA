package com.infosys.dao;

import java.util.List;

import com.infosys.model.Customer;
import com.infosys.model.Flight;
import com.infosys.model.FlightCustomer;

public interface DAO {
	public List<Flight> displayFlights(String dest);
	public boolean bookFlight(FlightCustomer fc);
	public boolean deleteBooking(int id);
	public boolean updateCustomer(Customer c,int id);
	public List<FlightCustomer> displayBookedFlights(int id);
}
