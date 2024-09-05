package com.infosys.entity;

import java.util.ArrayList;
import java.util.List;

public class ContactDetails {
	public List<Contact> getContactList(){
		List<Contact> listcontact=new ArrayList<>();
		listcontact.add(new Contact("sandeep","san@gmail.com","India"));
		listcontact.add(new Contact("sanjay","jay@gmail.com","India"));
		return listcontact;
		
	}
}
