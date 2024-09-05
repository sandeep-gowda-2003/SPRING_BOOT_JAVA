package com.infosys.pojo;

public interface Customer {
	void addCustomer();
	String addCustomerReturnValue();
	void addCustomerThrowException() throws Exception;
	void addCustomerAround(String name);
}
