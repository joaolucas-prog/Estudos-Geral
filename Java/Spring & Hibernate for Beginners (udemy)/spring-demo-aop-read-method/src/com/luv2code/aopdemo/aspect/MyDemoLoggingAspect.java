package com.luv2code.aopdemo.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import com.luv2code.aopdemo.Account;

@Aspect
@Component
@Order(1)
public class MyDemoLoggingAspect {
	
	@Before("com.luv2code.aopdemo.aspect.LuvAopExpressions.forDaoPacakgeWithoutGetAndSet()")
	public void beforeAddAccountAdvice(JoinPoint joinPoint) {
		System.out.println("\nExecuting beforeAddAccountAdvice() MyDemoLoggingAspect");
		
		MethodSignature metSig =  (MethodSignature) joinPoint.getSignature();
		System.out.println("Method:" + metSig);
		
		Object[] args = joinPoint.getArgs();
		
		for ( Object arg : args) {
			System.out.println(arg);
			if(arg instanceof Account) {
				Account acc = (Account) arg;
				System.out.println("Account name:" + acc.getName());
				System.out.println("Account level:" + acc.getLevel());
			}
		}
		
	}
	
}
