package com.infosys.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.infosys.entity.Departments;

public interface DepartmentRepository  extends JpaRepository<Departments, Long>{

}
