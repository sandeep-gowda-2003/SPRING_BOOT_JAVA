package com.infosys.Emp;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class LoggingAspect {
	@Before("execution(* com.infosys.Emp.Employee.display(..))")
	public void beforeDisplay() {
		System.out.println("BeforeDisplay method");
	}
	@After("execution(* com.infosys.Emp.Employee.display(..))")
	public void afterDisplay() {
		System.out.println("AfterDisplay method");
	}
	@AfterReturning(pointcut = "execution(* com.infosys.Emp.Employee.grossSalary(..))",returning="result")
	public void afterReturningGross(JoinPoint joinpoint,Object result) {
		System.out.println("The result of GrossSalary is = "+result);
	}
	@Around("execution(* com.infosys.Emp.Employee.netSalary(..))")
	public void aroundNetSalary(ProceedingJoinPoint joinPoint) throws Throwable{
		System.out.println("Before AroundNetSalary()");
		joinPoint.proceed();
		System.out.println("After AroundNetSalary()");
	}
}
