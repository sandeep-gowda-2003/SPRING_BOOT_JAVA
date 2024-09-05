package com.infosys.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.infosys.domain.Customers;
import com.infosys.dto.Customersdto;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;

@Repository
public class CustomerRepositoryImpl implements CustomerRepository{

	@PersistenceContext
	private EntityManager entityManager;
	
	//this is using Customers directly
	@Override
	public List<Customers> getCustomerdetails() {
		// TODO Auto-generated method stub
		String queryString = "select c from Customers c";
		Query query=entityManager.createQuery(queryString);
		List<Customers> c=query.getResultList();
		return c;
	}

	//this is using Customersdto
	@Override
	public List<Customersdto> getCustomerdetailsDTO() {
		// TODO Auto-generated method stub
		List<Customersdto> customerdto=null;
		String queryString = "select c from Customers c";
		Query query=entityManager.createQuery(queryString);
		customerdto=new ArrayList<Customersdto>();
		
		List<Customers> c=query.getResultList();
		for(Customers i:c) {
			Customersdto customerDTO = new Customersdto();
			customerDTO.setCustomer_id(i.getCustomer_id());
			customerDTO.setFirstname(i.getFirstname());
			customerdto.add(customerDTO);
		}
		return customerdto;
	}

	@Override
	public List<Object[]> getCustomerbyfirstnameAndemail() {
		String queryString="select c.firstname,c.email from Customers c";
		Query query=entityManager.createQuery(queryString);
		List<Object[]> customers=query.getResultList();
		
		return customers;
	}

	@Override
	public List<Customers> getCustomerdetailsbyId(Integer id) {
		String queryString="select c from Customers c where c.customer_id=?1";
		Query query=entityManager.createQuery(queryString);
		query.setParameter(1, id);
		List<Customers> c=query.getResultList();
		return c;
	}

	@Override
	public List<Customers> getfullCustomerdetails() {
		String queryString1="select c from Customers c where c.customer_id=3";
		//there is no city in the database
		String queryString2="select c from Customers c where c.city!='PUNE";
		String queryString3="select c from Customers c where c.creditpoints between 10 and 17";
		String queryString4="select c from Customers c where c.firstname like 's%'";
		String queryString5="select c from Customers c where c.city in ('MUMBAI','PUNE')";
		//THIS BELOW IS THE WAY TO OPERATE ON DATE
		String queryString6="select c from Customers c where c.date>CAST('1993-04-30' AS Date)";
		Query query=entityManager.createQuery(queryString6);
		List<Customers> c=query.getResultList();
		return c;
	}

	@Override
	public Integer updateLastnameofCustomer(Integer id, String lastname) {
		String queryString="update Customers c set c.lastname=?1 where c.customer_id=?2";
		Query query=entityManager.createQuery(queryString);
		query.setParameter(1, lastname);
		query.setParameter(2, id);
		return query.executeUpdate();
	}

	@Override
	public Integer deleteCustomer(String email) {
		// TODO Auto-generated method stub
		String queryString="delete Customers c where c.email=?1";
		Query query=entityManager.createQuery(queryString);
		query.setParameter(1, email);
		return query.executeUpdate();
	}

	@Override
	public List<Object[]> getCustomerCountforactive() {
		String queryString="select c.active,count(c) from Customers c group by c.active";
		Query query=entityManager.createQuery(queryString);
		List<Object[]> result=query.getResultList();
		return result;
	}

	
	//aggregate functions
	@Override
	public Double getAverageCredits() {
		//similarly you can perform for min max sum count etc
		String queryString="select avg(c.creditpoints) from Customers c";
		Query query=entityManager.createQuery(queryString);
		return (Double) query.getSingleResult();
	}
}
