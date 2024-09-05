package com.infosys;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.infosys.config.jdbcconfig;
import com.infosys.dao.StudentDAO;
import com.infosys.model.Student;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(jdbcconfig.class);
		StudentDAO studentDAO = context.getBean(StudentDAO.class);
		System.out.println("list of students");
		for(Student s:studentDAO.listStudent()) {
			System.out.println(s);
		}
//		System.out.println("Inserting student details");
//		Student student=new Student(16,"sachin","civil",89);
//		System.out.println(studentDAO.createStudent(student));
//		
//		Student  student_reg=studentDAO.getStudentDetails(16);
//		for(Student s:studentDAO.listStudent()) {
//			System.out.println(s);
//		}
		
//		System.out.println(studentDAO.deleteStudent(student_reg));
//		for(Student s:studentDAO.listStudent()) {
//			System.out.println(s);
//		}
		
//		System.out.println("update the student by regno");
//		Student studentbyregno=studentDAO.getStudentDetails(15);
//		studentbyregno.setName("rahil");
//		studentbyregno.setSubject("ai");
//		studentbyregno.setMarks(45);
//		System.out.println(studentDAO.updateStudent(studentbyregno));
//		for(Student s:studentDAO.listStudent()) {
//			System.out.println(s);
//		}
	}

}
