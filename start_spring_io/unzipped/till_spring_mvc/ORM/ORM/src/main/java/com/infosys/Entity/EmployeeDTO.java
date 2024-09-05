package com.infosys.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeDTO {
	private int emp_id;
	private int salary;
	private String first_name,last_name;
	
	public static Employee prepareEmployeeEntity(EmployeeDTO employeeDTO) {
		Employee employeeEntity = new Employee();
		employeeEntity.setEmp_id(employeeDTO.getEmp_id());
		employeeEntity.setFirst_name(employeeDTO.getFirst_name());
		employeeEntity.setLast_name(employeeDTO.getLast_name());
		employeeEntity.setSalary(employeeDTO.getSalary());
		return employeeEntity;
	}
}
