package com.infosys.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Shipper {
	@Id
	@Column
	private Integer shipper_id;
	@Column
	private String company_name;
	@Column
	private Integer phone_no;
}
