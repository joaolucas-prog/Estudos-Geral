package com.luv2code.aopdemo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(2)
public class MyCloudLogAspect {

	@Before("com.luv2code.aopdemo.aspect.LuvAopExpressions.forDaoPacakgeWithoutGetAndSet()")
	public void logToCloudAsync() {
		System.out.println(" executing logToCloudAsync() MyCloudLogAspect");
	}
}
