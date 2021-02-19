package com.luv2code.aopdemo.aspect;

import java.util.List;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
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

	@After("execution(* com.luv2code.aopdemo.dao.AccountDAO.findAccount(..))") //executa após a execução do méthodo se o metodo funcionar ou n, como o finnaly (antes das versões 5.2.7 do spring executava antes do afterreturn e afterthrowing agora executa depois)
	public void afterFinallyAccount(JoinPoint joinPoint) {
		String method = joinPoint.getSignature().toShortString();
		
		System.out.println("Executing After (finnaly on method: " + method);
		
	}

	@AfterThrowing(pointcut = "execution(* com.luv2code.aopdemo.dao.AccountDAO.findAccount(..))", throwing = "theException")//executa após a execução do metodo e que retornou uma exceção
	public void afterThrowingAccount(JoinPoint joinPoint, Throwable theException) {

		String method = joinPoint.getSignature().toShortString();

		System.out.println("Executing AfterThrowing on method: " + method);

		System.out.println("The Exception is : " + theException);

	}

	@AfterReturning(pointcut = "execution(* com.luv2code.aopdemo.dao.AccountDAO.findAccount(..))", returning = "result")//executa após a execução do metodo e que não ocorreu exeções
	public void afterReturningFindAccount(JoinPoint joinPoint, List<Account> result) {

		String method = joinPoint.getSignature().toShortString();

		System.out.println("Executing @AfterReturning on method: " + method);

		System.out.println("result: " + result);

		result.stream().forEach(account -> {
			account.setName(account.getName().toUpperCase());
			account.setLevel(account.getLevel().toLowerCase());
		});
	}

	@Before("com.luv2code.aopdemo.aspect.LuvAopExpressions.forDaoPacakgeWithoutGetAndSet()")//executa antes do metodo ser executado
	public void beforeAddAccountAdvice(JoinPoint joinPoint) {
		System.out.println("\nExecuting beforeAddAccountAdvice() MyDemoLoggingAspect");

		MethodSignature metSig = (MethodSignature) joinPoint.getSignature();
		System.out.println("Method:" + metSig);

		Object[] args = joinPoint.getArgs();

		for (Object arg : args) {
			System.out.println(arg);
			if (arg instanceof Account) {
				Account acc = (Account) arg;
				System.out.println("Account name:" + acc.getName());
				System.out.println("Account level:" + acc.getLevel());
			}
		}

	}

}
