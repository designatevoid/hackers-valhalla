package net.designated.aopTest;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class LoggingAspect {
	
	@Around("execution(* App.*(..))")
	public Object advice(ProceedingJoinPoint joinPoint) throws Throwable {
		System.out.println("Starting main.");
		Object ret = joinPoint.proceed();
		System.out.println("Ending main.");
		return ret;
	}

}
