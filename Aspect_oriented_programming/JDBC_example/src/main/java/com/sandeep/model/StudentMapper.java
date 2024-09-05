package com.sandeep.model;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class StudentMapper implements RowMapper<Student>{

	@Override
	public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
		Student s=new Student();
		s.setRegno(rs.getInt("regno"));
		s.setMarks(rs.getInt("marks"));
		s.setName(rs.getString("name"));
		s.setSubject(rs.getString("subject"));
		return s;
	}
	

}
