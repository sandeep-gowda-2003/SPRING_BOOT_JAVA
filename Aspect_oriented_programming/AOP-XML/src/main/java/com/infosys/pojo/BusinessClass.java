package com.infosys.pojo;

public class BusinessClass {
	public void welcome() {
		System.out.println("Welcome to AOP XML");
	}
	public int sum(int a,int b) {
		System.out.println("sum invoked");
		return a+b;
	}
}
