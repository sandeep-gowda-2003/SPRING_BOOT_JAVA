package com.infosys.pojo;

import org.aspectj.lang.JoinPoint;

public class AspectClass {
//	public void myAdvice(JoinPoint jp) {
//		System.out.println("Additional advice concept");
//	}
	public void myAdvice(JoinPoint jp,Object result) {
		System.out.println("Additional info");
		System.out.println("Method Signature"+jp.getSignature().getName());
		System.out.println("Result of Advice"+result);
		System.out.println("end of myadvice");
	}
}
