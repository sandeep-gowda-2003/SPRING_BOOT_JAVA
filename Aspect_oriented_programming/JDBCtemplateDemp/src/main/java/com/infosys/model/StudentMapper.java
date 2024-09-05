package com.infosys.model;

import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.tree.RowMapper;
import javax.swing.tree.TreePath;

import org.springframework.stereotype.Component;

@Component
public class StudentMapper implements org.springframework.jdbc.core.RowMapper<Student>{

	@Override
	public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
		Student student=new Student();
		student.setRegno(rs.getInt("regno"));
		student.setName(rs.getString("name"));
		student.setSubject(rs.getString("subject"));
		student.setMarks(rs.getInt("marks"));
		
		return student;
	}

	
}
