package com.springaop.AOP;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class MyAspect {
	
	@Before("execution(* com.springaop.services.PaymentService.makepament(..))")
	public void printBefore() {
		System.out.println("Payment Started");
	}
	@AfterReturning("execution(* com.springaop.services.PaymentService.makepament(..))")
	public void printAfterReturning() {
		System.out.println("Payment done after returning");
	}
	@AfterThrowing("execution(* com.springaop.services.PaymentService.makepament(..))")
	public void printAfterThrowing() {
		System.out.println("Payment done after throwing exception");
	}
	@After("execution(* com.springaop.services.PaymentService.makepament(..))")
	public void printAfter() {
		System.out.println("Payment done completion");
	}

}
