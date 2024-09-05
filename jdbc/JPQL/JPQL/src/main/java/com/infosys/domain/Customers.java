package com.infosys.domain;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name="customers")
public class Customers {
	@Id
	private Integer customer_id;
	private Boolean active;
	private Integer creditpoints;
	private String firstname;
	private String lastname;
	private String email;
	private String contactnumber;
	private Integer addressid;
	private Date date;
}
