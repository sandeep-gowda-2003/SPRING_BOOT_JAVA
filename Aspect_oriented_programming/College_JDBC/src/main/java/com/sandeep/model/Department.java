package com.sandeep.model;

import java.sql.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Department {
	Integer dept_id,dept_intake,dept_duration;
	String dept_name;
}
