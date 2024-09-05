package com.infosys.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.infosys.domain.Customers;

public interface CustomerRepository extends JpaRepository<Customers, Integer>{
	List<Customers> findByEmail(String email);
	List<Customers> findByActiveTrue();
	List<Customers> findByCreditpointsGreaterThanEqual(int points);
	List<Customers> findByCreditpointsBetween(int point1,int point2);
	List<Customers> findByLastnameOrderByFirstnameAsc(String lastname);
	List<Customers> findByEmailAndContactnumber(String email,String contactno);
}
