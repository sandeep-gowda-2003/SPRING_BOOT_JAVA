package com.infosys.pojo;

import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.stereotype.Component;

@Component
public class User {
	private String username;
	@Lookup
	public Role createRole() {
		return null;
	}
	
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String assignRole(String name) {
		Role role = createRole();
		role.setName(name);
		return this.username+" user role is "+role.getName();
	}
}
