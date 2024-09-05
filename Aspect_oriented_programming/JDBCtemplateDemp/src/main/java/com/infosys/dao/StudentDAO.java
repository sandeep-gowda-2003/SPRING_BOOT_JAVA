package com.infosys.dao;

import java.util.List;

import org.springframework.stereotype.Component;

import com.infosys.model.Student;

@Component
public interface StudentDAO {
	public List<Student> listStudent();
	public boolean deleteStudent(Student student);
	public boolean createStudent(Student student);
	public Student getStudentDetails(int reg);
	public boolean updateStudent(Student student);

}
