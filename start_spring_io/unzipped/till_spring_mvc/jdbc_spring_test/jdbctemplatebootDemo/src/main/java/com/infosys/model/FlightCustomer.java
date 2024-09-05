package com.infosys.model;

import lombok.Data;

@Data
public class FlightCustomer {
	private String pnr;
	private String firstname,lastname,seatno;
	private int customer_id;
}
