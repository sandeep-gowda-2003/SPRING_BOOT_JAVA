package com.infosys.pojo;

import java.util.Arrays;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

// this class is the cross cutting aspect class
@Aspect
public class LoggingAspect {
	@Pointcut("execution(* Customer.*(..))")
	public void point() {
	}
	
//	@Before("point()") //this below is also fine and it does not require @Pointcut to be defined
	@Before("execution(* com.infosys.pojo.Customer.addCustomer(..))")
	public void logBefore(JoinPoint joinPoint) {
		System.out.println("logBefore() is running");
		System.out.println("hijacked: "+joinPoint.getSignature().getName()+"\n\n");
	}
	
//	@After("point()")
	@After("execution(* com.infosys.pojo.Customer.addCustomer(..))")
	public void logAfter(JoinPoint joinPoint) {
		System.out.println("logAfter() is running");
		System.out.println("hijacked: "+joinPoint.getSignature().getName()+"\n\n");
	}
	
	@AfterReturning(pointcut="execution(* com.infosys.pojo.Customer.addCustomerReturnValue(..))",returning = "result")
	public void afterReturn(JoinPoint joinPoint,Object result) {
		System.out.println("logAfterReturning() is running");
		System.out.println("hijacked: "+joinPoint.getSignature().getName());
		System.out.println("Method returned value is "+result+"\n\n");
	}
	
	@AfterThrowing(pointcut="execution(* com.infosys.pojo.Customer.addCustomerThrowException(..))", throwing="error")
	public void logAfterThrowing(JoinPoint joinPoint, Throwable error) {
		System.out.println("logAfterthrowing()");
		System.out.println("hijacked: "+joinPoint.getSignature().getName()+"\n\n");
		System.out.println("Exception"+error);
		
	}
	@Around("execution(* com.infosys.pojo.Customer.addCustomerAround(..))")
	public void logAround(ProceedingJoinPoint joinPoint) throws Throwable{
		System.out.println("logAround()");
		System.out.println("hijacked: "+joinPoint.getSignature().getName()+"\n\n");
		System.out.println("hijacked arguments: "+Arrays.toString(joinPoint.getArgs()));
		System.out.println("Around is running");
		joinPoint.proceed();
		System.out.println("Around after is running");
	}
}
