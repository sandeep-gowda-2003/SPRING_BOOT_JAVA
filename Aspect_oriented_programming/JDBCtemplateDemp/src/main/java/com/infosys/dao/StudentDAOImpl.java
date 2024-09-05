package com.infosys.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.infosys.model.Student;
import com.infosys.model.StudentMapper;

@Component
public class StudentDAOImpl implements StudentDAO{
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	private final String SQL_DELETE_STUDENT="delete from student where regno=?";
	private final String SQL_UPDATE_STUDENT="update student set name=?,subject=?,marks=? where regno=?";
	private final String SQL_INSERT_STUDENT="insert into student(regno,name,subject ,marks) values(?,?,?,?)";
	private final String SQL_FIND_STUDENT="select * from student where regno=?";
	
	public List<Student> listStudent(){
		String SQL="select * from student";
		List<Student> students=jdbcTemplate.query(SQL, new StudentMapper());
		return students;
	}

//	@Override
//	public boolean deleteStudent(Student student) {
//		// TODO Auto-generated method stub
//		return false;
//	}

	@Override
	public boolean createStudent(Student student) {
		return jdbcTemplate.update(SQL_INSERT_STUDENT,student.getRegno(),student.getName(),student.getSubject(),student.getMarks())>0;
	}


	@Override
	public boolean deleteStudent(Student student) {
		return jdbcTemplate.update(SQL_DELETE_STUDENT,student.getRegno())>0;
	}
	
	@SuppressWarnings("deprecation")
	public Student getStudentDetails(int reg) {
		System.out.println(jdbcTemplate.queryForObject(SQL_FIND_STUDENT, new Object[] {reg},new StudentMapper()));
		return jdbcTemplate.queryForObject(SQL_FIND_STUDENT, new Object[] {reg},new StudentMapper());
	}
	
	@Override
	public boolean updateStudent(Student student) {
		return jdbcTemplate.update(SQL_UPDATE_STUDENT,student.getName(),student.getSubject(),student.getMarks(),student.getRegno())>0;
	}
	
//	
}
