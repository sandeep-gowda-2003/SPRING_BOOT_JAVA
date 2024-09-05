package com.infosys.pojo;

public  class CustomerImpl implements Customer{

	@Override
	public void addCustomer() {
		System.out.println("addcustomer() is called ");
	}

	@Override
	public String addCustomerReturnValue() {
		return "Hello";
	}

	@Override
	public void addCustomerThrowException() throws Exception{
		System.out.println("addCustomerThrowException");
		throw new Exception("Generic Error"); 
	}

	@Override
	public void addCustomerAround(String name) {
		System.out.println("addCustomerAround() is running");
	}

}
