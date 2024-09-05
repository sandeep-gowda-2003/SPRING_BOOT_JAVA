package com.infosys.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Table(name="Address")
@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Address {
	@Id
	Integer address_id;
	String city,pincode;
}
