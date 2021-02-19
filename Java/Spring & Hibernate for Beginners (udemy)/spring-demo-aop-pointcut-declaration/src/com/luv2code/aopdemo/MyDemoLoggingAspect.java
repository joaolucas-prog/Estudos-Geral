package com.luv2code.aopdemo;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyDemoLoggingAspect {
	
	@Pointcut("execution(* com.luv2code.aopdemo.dao.*.*(..))")
	private void forDaoPackage() {}//como se fosse uma váriavel para a expression
	
	@Pointcut("execution(* com.luv2code.aopdemo.dao.*.get*(..))")
	public void getter() {}
	
	@Pointcut("execution(* com.luv2code.aopdemo.dao.*.set*(..))")
	public void setter() {}
	
	@Pointcut("forDaoPackage() && !(getter() || setter())")
	public void forDaoPacakgeWithoutGetAndSet() {}
	
	@Before("forDaoPacakgeWithoutGetAndSet()")
	public void beforeAddAccountAdvice() {
		System.out.println(" Executing @Before adivice ");
	}

	@Before("forDaoPacakgeWithoutGetAndSet()")
	public void anotherAdvice() {
		System.out.println(" executing anotherAdivice()");
	}
	
}
