package com.infosys.pojo;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Student1 implements StudentInformation{

	@Override
	public String[] getDetails() {
		String[] s1= {"samarth","aiml","bengaluru"};
		return s1;
	}
	
}
