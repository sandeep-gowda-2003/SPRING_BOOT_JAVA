package com.infosys.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.infosys.entity.Employees;

public interface EmployeeRepository extends JpaRepository<Employees, Integer>{

}
