package com.infosys.domain;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Loan {
	@Id
	private Integer loan_id;
	private Integer amount;
	private String status,issue_date;
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="custid")
	private Customers customer;

}
