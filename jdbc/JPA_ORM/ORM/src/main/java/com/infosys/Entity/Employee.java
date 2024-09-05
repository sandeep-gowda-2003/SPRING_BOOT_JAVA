package com.infosys.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="employee_orm")
public class Employee {
	
	@Id
	@Column(name="id")
	private int emp_id;
	private int salary;
	private String first_name,last_name;
	
	public static EmployeeDTO prepareDTO(Employee employeeEntity) {
		EmployeeDTO empDTO = new EmployeeDTO();
		empDTO.setEmp_id(employeeEntity.getEmp_id());
		empDTO.setFirst_name(employeeEntity.getFirst_name());
		empDTO.setLast_name(employeeEntity.getLast_name());
		empDTO.setSalary(employeeEntity.getSalary());
		return empDTO;
	}
}
