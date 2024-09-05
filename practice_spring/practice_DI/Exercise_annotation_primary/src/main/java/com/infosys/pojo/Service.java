package com.infosys.pojo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//import com.infosys.pojo;

@Component
public class Service {
	@Autowired
	private StudentInformation studentinformation;
	
	public Service(StudentInformation studentinformation) {
		this.studentinformation=studentinformation;
	}
	void sendInformation() {
		String[] details= studentinformation.getDetails();
		for(String detail:details) {
			System.out.println(detail);
		}
	}
}
