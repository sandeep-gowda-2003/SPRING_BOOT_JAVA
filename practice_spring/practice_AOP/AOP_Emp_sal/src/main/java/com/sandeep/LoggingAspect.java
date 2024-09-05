package com.sandeep;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class LoggingAspect {
	@Pointcut("execution(* EmployeeImpl.*(..))")
	public void point() {
	}
	
	@Before("point()")
	public void before(JoinPoint joinPoint) {
		System.out.println("this is before "+joinPoint.getSignature().getName());
	}

	@After("point()")
	public void after(JoinPoint joinPoint) {
		System.out.println("this is after "+joinPoint.getSignature().getName());
	}
	
	@AfterReturning(pointcut = "point()",returning = "result")
	public void afterReturning(JoinPoint joinPoint,Object result) {
		System.out.println("the result is after returning: "+result);
	}
	
	@Around("point()")
	public void around(ProceedingJoinPoint joinPoint) throws Throwable {
		System.out.println("this is around before");
		joinPoint.proceed();
		System.out.println("this is around after");
	}
}
