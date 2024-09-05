package com.infosys.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Customers {
	@Id
	@Column(name="customer_id")
	private Integer customerid;
	private Boolean active;
	private Integer creditpoints;
	private String firstname,lastname,email,contactnumber;
	private Integer addressid;
}
