package com.luv2code.springdemo.aspect;

import java.util.logging.Logger;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class CRMLogginsAspect {

	private Logger myLogger = Logger.getLogger(getClass().getName());

	@Pointcut("execution(* com.luv2code.springdemo.controller.*.*(..))")
	public void forControllerPackage() {
	}

	@Pointcut("execution(* com.luv2code.springdemo.service.*.*(..))")
	public void forServicePackage() {
	}

	@Pointcut("execution(* com.luv2code.springdemo.dao.*.*(..))")
	public void forDaoPackage() {
	}

	@Pointcut(" forControllerPackage() || forServicePackage() || forDaoPackage()")
	public void forWorkFlow() {
	}

	@Before("forWorkFlow()")
	public void beforeWorkFlow(JoinPoint theJoinPoint) {

		String methodName = theJoinPoint.getSignature().toShortString();

		myLogger.info(" @Before working on method: " + methodName);

		Object[] args = theJoinPoint.getArgs();

		for (Object tempArg : args) {
			myLogger.info("argument : " + tempArg);
		}
	}

	@AfterReturning(pointcut = "forWorkFlow()", returning = "result")
	public void afterWorkFlow(JoinPoint theJoinPoint, Object result) {
		
		String methodName = theJoinPoint.getSignature().toShortString();

		myLogger.info(" @Before working on method: " + methodName);
		
		myLogger.info("result :"+result);

	}

}
