package com.infosys.demo;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class LoggingAspect {
	
	@Before("execution(* com.infosys.demo.Bank.deposit(..))")
	public void beforeLogging() {
		System.out.println("before logging method call");
	}
	@After("execution(* com.infosys.demo.Bank.deposit(..))")
	public void afterLogging() {
		System.out.println("after logging method call");
	}
	
	@AfterReturning(pointcut="execution(* com.infosys.demo.Bank.checkBalance(..))",returning = "retVal")
	public void afterReturning(int retVal) {
		System.out.println("after returning current balance "+retVal);
	}
}
