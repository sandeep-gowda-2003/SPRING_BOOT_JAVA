package com.sandeep.dao;

import java.util.List;

import com.sandeep.model.Student;

public interface StudentDAO {
	public List<Student> stud();
	public boolean createStudent(Student student);
	
}
