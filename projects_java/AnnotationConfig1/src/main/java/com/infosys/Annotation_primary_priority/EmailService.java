package com.infosys.Annotation_primary_priority;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class EmailService {

	@Autowired
	private DataSource dataSource;
	
	public EmailService(DataSource dataSource) {
		this.dataSource=dataSource;
	}
	void sendEmail() {
		String[] emails=dataSource.getEmails();
		for(String email:emails) {
			System.out.println(email);
		}
	}
}
