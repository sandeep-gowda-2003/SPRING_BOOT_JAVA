package com.infosys.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DepartmentsDTO {

	private Long id;
	private String departmentname;
	private String departmentaddress;
	private String departmentcode;

}