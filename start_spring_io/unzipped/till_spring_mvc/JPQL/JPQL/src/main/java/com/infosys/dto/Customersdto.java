package com.infosys.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Customersdto {
	private Integer customer_id;
	private Boolean active;
	private Integer creditpoints;
	private String firstname;
	private String lastname;
	private String email;
	private String contactnumber;
	private Integer addressid;

}
