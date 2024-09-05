package com.infosys.pojo;
import org.springframework.stereotype.Component;

@Component
public class Student2 implements StudentInformation{

	@Override
	public String[] getDetails() {
		String[] s2= {"manoj","cse","mangaluru"};
		return s2;
	}

}
