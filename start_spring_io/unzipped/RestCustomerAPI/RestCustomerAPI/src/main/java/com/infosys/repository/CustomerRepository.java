package com.infosys.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.infosys.entity.Customer;

import jakarta.transaction.Transactional;

public interface CustomerRepository extends JpaRepository<Customer, Integer>{
	
	@Transactional
	@Modifying(clearAutomatically = true)
	@Query(value="update customers set first_name=?,last_name=?,email=?,contactnumber=?,active=?,creditpoints=? where customer_id=?",nativeQuery = true)
	public void updateCustomer(String fname,String lname,String email,String contactnumber,Boolean active,Integer creditpoints,Integer custid);

}
