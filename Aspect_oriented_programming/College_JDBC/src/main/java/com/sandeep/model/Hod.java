package com.sandeep.model;

import java.sql.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@NoArgsConstructor
@AllArgsConstructor
@Data
public class Hod {
	Integer hod_id,hod_experience;
	Date hod_incharge_date;
	String hod_name;
}
