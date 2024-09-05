package com.sandeep.Annotation_Primary_priority;

import org.springframework.stereotype.Component;

@Component
//@Primary
public class PostgreSQLdataSource implements DataSource{

	@Override
	public String[] getEmails() {
		String[] emails= {"sandy@gmail.com","sanju@gmail.com"};
		return emails;
	}

}
