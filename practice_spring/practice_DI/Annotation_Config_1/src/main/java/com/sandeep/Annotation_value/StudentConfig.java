package com.sandeep.Annotation_value;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StudentConfig {
	
	@Bean
	public Student student() {
		Student stu = new Student();
		stu.setRollno(12);
		stu.setName("Sandy");
		stu.setAge(21);
		return stu;
	}
}
