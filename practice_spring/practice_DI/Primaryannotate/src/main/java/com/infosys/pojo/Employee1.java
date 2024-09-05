package com.infosys.pojo;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
//@Primary
public class Employee1 implements Information{

	@Override
	public String[] getDetails() {
		String[] emp1details= {"rajesh","developer","bengaluru"};
		return emp1details;
	}

}
