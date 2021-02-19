package com.luv2code.aopdemo.aspect;

import java.util.List;
import java.util.logging.Logger;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
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
	
	private Logger myLogger =
			Logger.getLogger(getClass().getName()); // usei o logger para evitar prints em ordem errada
	
	@Around("execution(* com.luv2code.aopdemo.service.*.getFortune(..))")
	public Object aroundGetFortune(ProceedingJoinPoint theProceedingJoinPoint) throws Throwable{
		
		String method = theProceedingJoinPoint.getSignature().toShortString();
	
		myLogger.info("Executing @Around on method: " + method);
		
		long begin = System.currentTimeMillis();
		
		//theProceedingJoinPoint manipula o metodo alvo
		Object result = null;
		try {
			result = theProceedingJoinPoint.proceed();
		} catch (Throwable e) {
			myLogger.warning(e.getMessage());
			
			result = "Deu pau mas relaxa que o Pai ta aqui";
		}
		
		long end = System.currentTimeMillis();
		
		long duration = end - begin;
		
		myLogger.info("Duration: " +duration/1000.0 + "seconds" );
		return result;
	}
	
	@After("execution(* com.luv2code.aopdemo.dao.AccountDAO.findAccount(..))") //executa após a execução do méthodo se o metodo funcionar ou n, como o finnaly (antes das versões 5.2.7 do spring executava antes do afterreturn e afterthrowing agora executa depois)
	public void afterFinallyAccount(JoinPoint joinPoint) {
		String method = joinPoint.getSignature().toShortString();
		
		myLogger.info("Executing After (finnaly on method: " + method);
		
	}

	@AfterThrowing(pointcut = "execution(* com.luv2code.aopdemo.dao.AccountDAO.findAccount(..))", throwing = "theException")//executa após a execução do metodo e que retornou uma exceção
	public void afterThrowingAccount(JoinPoint joinPoint, Throwable theException) {

		String method = joinPoint.getSignature().toShortString();

		myLogger.info("Executing AfterThrowing on method: " + method);

		myLogger.info("The Exception is : " + theException);

	}

	@AfterReturning(pointcut = "execution(* com.luv2code.aopdemo.dao.AccountDAO.findAccount(..))", returning = "result")//executa após a execução do metodo e que não ocorreu exeções
	public void afterReturningFindAccount(JoinPoint joinPoint, List<Account> result) {

		String method = joinPoint.getSignature().toShortString();

		myLogger.info("Executing @AfterReturning on method: " + method);

		myLogger.info("result: " + result);

		result.stream().forEach(account -> {
			account.setName(account.getName().toUpperCase());
			account.setLevel(account.getLevel().toLowerCase());
		});
	}

	@Before("com.luv2code.aopdemo.aspect.LuvAopExpressions.forDaoPacakgeWithoutGetAndSet()")//executa antes do metodo ser executado
	public void beforeAddAccountAdvice(JoinPoint joinPoint) {
		myLogger.info("\nExecuting beforeAddAccountAdvice() MyDemoLoggingAspect");

		MethodSignature metSig = (MethodSignature) joinPoint.getSignature();
		myLogger.info("Method:" + metSig);

		Object[] args = joinPoint.getArgs();

		for (Object arg : args) {
			myLogger.info(arg.toString());
			if (arg instanceof Account) {
				Account acc = (Account) arg;
				myLogger.info("Account name:" + acc.getName());
				myLogger.info("Account level:" + acc.getLevel());
			}
		}

	}

}
