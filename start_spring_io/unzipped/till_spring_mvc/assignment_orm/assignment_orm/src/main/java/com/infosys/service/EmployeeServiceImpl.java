package com.infosys.service;

import java.util.List;
import java.util.Optional;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infosys.domain.Address;
import com.infosys.domain.Employee;
import com.infosys.repository.AddressRepository;
import com.infosys.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService{
	@Autowired
	EmployeeRepository er;
	@Autowired
	AddressRepository ar;
	
	Scanner sc = new Scanner(System.in);
	
	@Override
	public void add(Employee e, Address a) {
		ar.saveAndFlush(a);
		er.saveAndFlush(e);
		System.out.println("Inserted successfully");
	}
	@Override
	public Employee view(int id) {
		Optional<Employee> e1=er.findById(id);
		Employee e2=e1.get();
		return  e2;
	}
	@Override
	public List<Employee> viewall() {
		return (List<Employee>) er.findAll();
	}
	@Override
	public void edit(int id) {
		Optional<Employee> e1=er.findById(id);
		Employee e2=e1.get();
		int a_id=e2.getAddress();
		Optional<Address> a =ar.findById(a_id);
		Address a1=a.get();
		System.out.print("Enter the city of employee: ");
		a1.setCity(sc.next());
		System.out.print("Enter the pincode of employee: ");
		a1.setPincode(sc.next());
		System.out.println("Edited successfully");
		ar.save(a1);
	}
	@Override
	public void delete(int id) {
		Optional<Employee> e1=er.findById(id);
		Employee e2=e1.get();
		int a_id=e2.getAddress();
		ar.deleteById(a_id);
		er.deleteById(id);
		System.out.println("deleted successfully");
	}
	

}
