package com.luv2code.aopdemo;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyDemoLoggingAspect {
	
	/*Pointcut Expression Language
	 * 
	 * execution(modifiers-pattern? return-type-pattern declaring-type-pattern?
	 * 			method-name-pattern(param-patern) throws-pattern?)
	 * 
	 * ? siginifica que não é obrigatórios
	 * 
	 * '*' significa que pode ser qualquer coisa
	 * 
	 *  modifiers-pattern: tipo de modificador - public , private , protected ....
	 *  
	 *  return-type-pattern: tipo de retorno - void , boolean ...
	 *  
	 *  declaring-type-pattern: classe que executa o metodo com.exemple.classEx.Method()..
	 *  
	 *  method-name-pattern(param-patern): nome do metodo e seus parametros
	 *  
	 *  throws-pattern: tipo execeção
	 * */

	//@Before("execution(public void com.luv2code.aopdemo.dao.AccountDAO.addAccount())") classe especifica
	//@Before("execution(public void addAccount())") qualquer metodo publico de retorno vazio com nome addAccount
	@Before("execution(public void add*())")//qualquer metodo publico de retorno vazio que começe com add
	public void beforeAddAccountAdvice() {
		System.out.println(" Executing @Before adivice on addAccount()");
	}
}
