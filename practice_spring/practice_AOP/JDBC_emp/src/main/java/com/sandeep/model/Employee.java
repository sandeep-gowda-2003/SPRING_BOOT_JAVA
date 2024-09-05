package com.sandeep.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Employee {
	private Integer emp_id,address;
	private String emp_name,department,base_location;
}
