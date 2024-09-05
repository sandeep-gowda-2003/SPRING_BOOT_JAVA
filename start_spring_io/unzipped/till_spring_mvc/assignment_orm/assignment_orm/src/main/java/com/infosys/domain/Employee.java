package com.infosys.domain;

import jakarta.persistence.Column;
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
@Table(name="employee_jpa")
public class Employee {
	@Id
	@Column
	Integer emp_id;
	Integer address;
	String emp_name,department,base_location;
	
}
