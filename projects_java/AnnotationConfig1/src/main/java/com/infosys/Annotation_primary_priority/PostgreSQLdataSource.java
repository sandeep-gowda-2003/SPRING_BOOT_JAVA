package com.infosys.Annotation_primary_priority;

import org.springframework.context.annotation.Primary;
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
