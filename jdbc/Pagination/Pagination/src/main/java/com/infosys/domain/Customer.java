package com.infosys.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Customer {
	@Id
	@Column(name="cust_id")
	private Integer id;
	@Column(name="cust_name")
	private String name;
	@Column
	private Integer age;
	@Column
	private Character genger;
	@Column
	private String address;
}
