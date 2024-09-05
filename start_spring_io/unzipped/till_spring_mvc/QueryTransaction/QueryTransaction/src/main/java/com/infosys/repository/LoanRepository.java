package com.infosys.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.infosys.domain.Customers;
import com.infosys.domain.Loan;

public interface LoanRepository extends JpaRepository<Loan, Integer>{
	@Query(value = "select * from loan where custid in (select customer_id from customers where firstname=?1)",nativeQuery = true)
	public List<Loan> findLoanstatus(String name);
}
