package com.practice.service;

import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.practice.entity.Student;
import com.practice.feignclient.AddressClient;
import com.practice.repository.StudentRepository;
import com.practice.response.AddressResponse;
import com.practice.response.StuAdress;
import com.practice.response.StudentResponse;

@Service
public class StudentService {
	@Autowired
	private StudentRepository repo;
	
	@Autowired
	private AddressClient client;
	
	@Autowired
	private ModelMapper mapper;
	
	public String insertOne(StuAdress s) {
		Student s1=new Student();
		s1.setName(s.getName());
		s1.setCourse(s.getCourse());
		AddressResponse a=new AddressResponse();
		a.setCity(s.getCity());
		a.setState(s.getState());
		ResponseEntity<AddressResponse> add=client.push(a);
		s1.setAddress(add.getBody().getId());
		repo.save(s1);
		return "successfull Insertion";
	}
	
	public Student insert(Student s) {
		Student s1=new Student();
		s1.setName(s.getName());
		s1.setCourse(s.getCourse());
		s1.setAddress(s.getAddress());
		s1=repo.save(s1);
		return s1;
		
	}
	
	public StudentResponse fetchbyId(Integer id) {
		Optional<Student> s=repo.findById(id);
		StudentResponse s1=mapper.map(s.get(), StudentResponse.class);
		return s1;
		
	}
	public StuAdress fetchall(Integer id) {
		System.out.println("inside fetchall");
		Optional<Student> s=repo.findById(id);
		StudentResponse s1=mapper.map(s.get(), StudentResponse.class);
		System.out.println("before address");
		ResponseEntity<AddressResponse> a=client.fetchbyId(Integer.parseInt(s1.getAddress()));
		System.out.println("after address");
		System.out.println(a.getBody());
		StuAdress s2=new StuAdress();
		s2.setId(s1.getId());
		s2.setName(s1.getName());
		s2.setCity(a.getBody().getCity());
		s2.setCourse(s1.getCourse());
		s2.setState(a.getBody().getState());
		System.out.println("after fetchall");
		return s2;
		
	}
}
