package com.infosys.pojo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Service {
	
	@Autowired
	private Information information;
	
	public Service(Information information) {
		this.information=information;
	}
	void sendInformation() {
		String[] details= information.getDetails();
		for(String detail:details) {
			System.out.println(detail);
		}
	}
}