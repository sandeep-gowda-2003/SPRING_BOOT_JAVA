package com.sandeep.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import com.sandeep.model.Student;
import com.sandeep.model.StudentMapper;

public class StudentDAOImpl implements StudentDAO{
	
	@Autowired
	private JdbcTemplate jdbc_temp;
	
	private final String sqlInsert="INSERT INTO student(regno,name,subject,marks) values(?,?,?,?)";
	
	public List<Student> stud(){
		String SQL="select * from student";
		List<Student> students=jdbc_temp.query(SQL,new StudentMapper());
		return students;
	}

	@Override
	public boolean createStudent(Student student) {
		return jdbc_temp.update(sqlInsert,student.getRegno(),student.getName(),student.getSubject(),student.getMarks())>0;
	}
}
