package com.infosys.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Employee {
	private Integer emp_id;
	private String emp_name;
	private String emp_desig;
	private Integer emp_sal;
}
