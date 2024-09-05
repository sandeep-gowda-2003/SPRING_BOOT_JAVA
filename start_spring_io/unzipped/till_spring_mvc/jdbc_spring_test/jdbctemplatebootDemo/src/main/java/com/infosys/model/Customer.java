package com.infosys.model;

import lombok.Data;

@Data
public class Customer {
	private Integer customer_id;
	private String first_name;
	private String last_name;
	private String email;
	private long mobile_no;
}
