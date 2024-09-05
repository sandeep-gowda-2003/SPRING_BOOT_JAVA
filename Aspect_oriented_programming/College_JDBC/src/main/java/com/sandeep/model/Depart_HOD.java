package com.sandeep.model;

import java.sql.Date;

import org.springframework.context.annotation.Scope;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Scope("prototype")
public class Depart_HOD {
	Integer dept_id,dept_intake,dept_duration;
	String dept_name;
	Integer hod_id,hod_experience;
	Date hod_incharge_date;
	String hod_name;
}
