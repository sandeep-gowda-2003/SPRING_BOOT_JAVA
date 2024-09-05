package com.infosys.entity;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class DepartmentsDto {
	private Long id;
	private String departmentName;
	private String departmentAddress;
	private String departmentCode;

}
