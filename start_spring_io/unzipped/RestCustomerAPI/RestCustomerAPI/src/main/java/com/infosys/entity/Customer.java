package com.infosys.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Table(name="customers")
public class Customer {
	@Id
	@Column(name = "customer_id")
//	@NotNull(message="cust_id not null")
	private Integer cid;
	private Boolean active;
	private Integer creditpoints;
	@Column(name = "firstname")
	private String fname;
	@Column(name="lastname")
	private String lname;
	private String email;
	private String contactnumber;
}
