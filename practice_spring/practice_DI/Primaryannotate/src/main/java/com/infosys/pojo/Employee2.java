package com.infosys.pojo;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import lombok.extern.apachecommons.CommonsLog;

@Component
@Primary
public class Employee2 implements Information{

	@Override
	public String[] getDetails() {
		String[] emp2details= {"sanjat","Tester","mysore"};
		return emp2details;
	}

}
