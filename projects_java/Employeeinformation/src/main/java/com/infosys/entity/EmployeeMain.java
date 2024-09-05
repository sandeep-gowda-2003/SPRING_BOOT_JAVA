package com.infosys.entity;

//ctrl+d to delete a line

public class EmployeeMain {

	public static void main(String[] args) {
		EmployeeMain EM = new EmployeeMain();
		Employee e = new Employee();
		System.out.println("Enter the details");
		e.setFirstname("Sandeep");
		e.setLastname("Gowda");
		e.setEmail("sandeep@gmail.com");
		System.out.println(e.getFirstname()+" "+e.getLastname());
	}

}
