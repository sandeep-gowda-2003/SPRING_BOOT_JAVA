package com.infosys.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infosys.entity.Customer;
import com.infosys.repository.CustomerRepository;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	CustomerRepository crepo;
	@Override
	public List<Customer> fetchAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Customer getById(Integer cid) {
		Optional<Customer> customerOptional=crepo.findById(cid);
		System.out.println("\ninside service");

		if(customerOptional.getClass()!=null) {
			return customerOptional.get();
		}
		return null;
	}

	@Override
	public Customer save(Customer customer) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String DeleteById(Integer cid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Customer> fetchCustomerDetails(Integer custid, String fname) {
		List<Customer> customerdetails = new ArrayList<Customer>();
		for(Customer customer:crepo.findAll()) {
			if(customer.getCid().equals(custid) && customer.getFname().equals(fname)){
//				System.out.println("_______________");
//				System.out.println(customer.getCid().getClass()+" : "+custId.getClass());
//				System.out.println(customer.getCid()+" : "+custId);
//				System.out.println(customer.getCid()==custId);
//				System.out.println("_____________________");
//				System.out.println(customer.getFname().getClass()+" : "+fame.getClass());
//				System.out.println(customer.getFname()+" : "+fame);
//				System.out.println(customer.getFname()==fame);
				customerdetails.add(customer);
			}
		}
		return customerdetails;
	}

	@Override
	public void update(String fname, String lname, String email, String contactnumber, Boolean active,
			Integer creditpoints, Integer custid) {
		// TODO Auto-generated method stub
		
	}

}
