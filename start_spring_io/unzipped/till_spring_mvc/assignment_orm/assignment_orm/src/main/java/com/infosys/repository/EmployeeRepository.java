package com.infosys.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.infosys.domain.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer>{

}
