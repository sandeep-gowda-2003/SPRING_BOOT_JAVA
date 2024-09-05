package com.infosys.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.infosys.domain.Customers;

import jakarta.transaction.Transactional;

public interface CustomerRepository extends JpaRepository<Customers, Integer>{
	@Transactional
	@Modifying(clearAutomatically = true)
	@Query(value="update customers set creditpoints=?1"+" where customer_id=?2",nativeQuery = true)
	public void customerupdate(int creditpoints,int custid);
	
	@Transactional
	@Modifying(clearAutomatically = true)
	@Query(value="delete from customers where customer_id=?",nativeQuery = true)
	public void customerdelete(int customerid);
	
	//this is named query defined in customers entity class
	List<Customers> findByEmail(String email);
	
	//JPQL QUERY
//	@Query("select c from Customers c where c.email=?")  entity query class name should be given
//	List<Customers> findByEmail(String email);
	
	
	@Query(value = "select * from customers where addressid in (select addressid from address where city=?1)",nativeQuery=true)
	public List<Customers> findByCitydetails(String city);
}
