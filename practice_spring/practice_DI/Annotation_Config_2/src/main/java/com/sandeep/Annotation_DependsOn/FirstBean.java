package com.sandeep.Annotation_DependsOn;


import org.springframework.beans.factory.annotation.Autowired;

public class FirstBean {
	
	@Autowired
	private SecondBean secondBean;
	
	@Autowired
	private ThirdBean thirdBean;
	
	public FirstBean() {
		System.out.println("FirstBean Initialized");
	}
	public void populatebeans() {
		secondBean.display();
		thirdBean.display();
	}
}
