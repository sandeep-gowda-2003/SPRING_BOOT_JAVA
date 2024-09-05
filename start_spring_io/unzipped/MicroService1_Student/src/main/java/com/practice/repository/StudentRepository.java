package com.practice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.practice.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Integer>{
	

}
