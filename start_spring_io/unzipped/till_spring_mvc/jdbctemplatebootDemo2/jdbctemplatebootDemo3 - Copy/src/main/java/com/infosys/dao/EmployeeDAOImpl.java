package com.infosys.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.infosys.model.Employee;
import com.infosys.model.EmployeeMapper;

@Component
public class EmployeeDAOImpl implements EmployeesDAO{
	private final String SQL_GET_ALL="select * from employee";
	private final String SQL_INSERT_EMPLOYEE="insert into employee(emp_id,emp_name,emp_desig,emp_sal)values(?,?,?,?)";
	private final String SQL_DELETE_EMPLOYEE="delete from employee where emp_id=?";
	
	@Autowired
	private JdbcTemplate jdbcTemplateObject;
	
	
	@Override
	public List<Employee> getAllEmployees() {
		return jdbcTemplateObject.query(SQL_GET_ALL, new EmployeeMapper());
	}


	@Override
	public boolean createEmployee(Employee employee) {
		return jdbcTemplateObject.update(SQL_INSERT_EMPLOYEE,employee.getEmp_id(),employee.getEmp_name(),employee.getEmp_desig(),employee.getEmp_sal())>0;
	}


	@Override
	public boolean deleteEmployee(int employee) {
		return jdbcTemplateObject.update(SQL_DELETE_EMPLOYEE,employee)>0;
	}

}
