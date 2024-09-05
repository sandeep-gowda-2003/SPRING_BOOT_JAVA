package com.infosys.DAO;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.infosys.Entity.Employee;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.PersistenceUnit;
import jakarta.persistence.Query;

@Repository("employeeRepository")
public class EmployeeDAOImpl implements EmployeeDAO{

	
	private EntityManagerFactory entityManagerFactory;
	
	@PersistenceUnit
	public void setEntityManagerFActory(EntityManagerFactory entityManagerFactory)
	{
		this.entityManagerFactory=entityManagerFactory;
	}
	
	@Override
	public List<Employee> getAll() {
		EntityManager entityManager =this.entityManagerFactory.createEntityManager();
		Query query=entityManager.createQuery("Select c from Employee c");
		return (List<Employee>)query.getResultList();
	}

	@Override
	public void insert(Employee employee) {
		EntityManager entityManager=this.entityManagerFactory.createEntityManager();
		entityManager.getTransaction().begin();
		entityManager.persist(employee);
		entityManager.getTransaction().commit();
	}

	@Override
	public int remove(int id) {
		EntityManager entityManager=this.entityManagerFactory.createEntityManager();
		entityManager.getTransaction().begin();
		int result=0;
		try {
			Employee e=entityManager.find(Employee.class, id);
			System.out.println(e+"this is repeat from dao");
			entityManager.remove(e);
			result=1;
			entityManager.getTransaction().commit();
		}
		catch(Exception e){
			entityManager.getTransaction().rollback();
		}
		entityManager.close();
		return result;
		
	}

	@Override
	public void update(int id, String last_name) {
		EntityManager entityManager=this.entityManagerFactory.createEntityManager();
		entityManager.getTransaction().begin();
		Employee e=entityManager.find(Employee.class, id);
		e.setLast_name(last_name);
		entityManager.getTransaction().commit();
		entityManager.close();
		
	}

	
}
