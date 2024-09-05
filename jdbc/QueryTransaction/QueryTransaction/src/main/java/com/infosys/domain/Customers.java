package com.infosys.domain;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@NamedQuery(name="Customers.findByEmail",query="select c from Customers c where c.email=?1")
public class Customers {
	@Id
	@Column(name="customer_id")
	private Integer customerid;
	private Boolean active;
	private Integer creditpoints;
	private String firstname,lastname,email,contactnumber;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="addressid",unique=true)
	private Address address;
}
