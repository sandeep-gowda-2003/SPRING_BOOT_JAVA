package com.infosys.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.infosys.entity.Employee;

import jakarta.transaction.Transactional;


public interface EmployeeRepository extends JpaRepository<Employee, Integer>{


	public Employee findByEmpidAndName(Integer empid,String Name);
	
	@Transactional
	@Modifying(clearAutomatically = true)
	@Query(value = "update employee set name=?1, designation=?2, salary=?3 where empid=?4 ",nativeQuery = true)
	public void updateEmployee(String name,String designation,Float salary,Integer empid);

}
