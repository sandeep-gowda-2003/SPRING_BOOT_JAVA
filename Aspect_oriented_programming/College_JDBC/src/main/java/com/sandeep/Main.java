package com.sandeep;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.sandeep.config.JdbcConfig;
import com.sandeep.dao.Dept_DAO;
import com.sandeep.model.Depart_HOD;
import com.sandeep.model.Department;
import com.sandeep.model.Hod;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(JdbcConfig.class);
		Dept_DAO d = context.getBean(Dept_DAO.class);
		Depart_HOD department = new Depart_HOD();
		department.setDept_id(3);
		department.setDept_name("ise");
		department.setDept_intake(100);
		department.setDept_duration(5);
		
//		System.out.println("\nINSERTING INTO DEPARTMENT");
//		System.out.println(d.addDepartment(department));
////		
		System.out.println("\nSEARCHING DEPARTMENT AND HOD USING DEPT_ID");
		System.out.println(d.searchDept(department));
//		
//		
//		System.out.println("UPDATING DEPT AND HOD NAME");
//		String dept_name="CSE",hod_name="MANGALA";
//		Integer dept_id=3;
//		System.out.println(d.updateNames(dept_name,dept_id, hod_name ));
//		
//		System.out.println("\nVIEW DEPARTMENT");
//		for(Department d1:d.list_dept()) {
//			System.out.println(d1);
//		}
//		
//		System.out.println("DELETE DEPARTMENT");
//		System.out.println(d.deleteDepartment(1));
		
	}

}
