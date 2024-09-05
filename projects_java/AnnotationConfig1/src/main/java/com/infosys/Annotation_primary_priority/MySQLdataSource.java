package com.infosys.Annotation_primary_priority;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class MySQLdataSource implements DataSource{

	@Override
	public String[] getEmails() {
		String[] emails= {"sam@gmail.com","sank@gmail.com"};
		return emails;
	}
	
}
