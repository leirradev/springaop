package com.morningstar.aop.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;

public class LoggingAspect {
//	wildcard expression
//	@Before("allGetters() && allCircleMethods()")
	/*@Before("allCircleMethods()")
	public void LoggingAdvice() {
//		System.out.println("Advice run. Get method called");
//		System.out.println(joinPoint.toString());
//		Circle circle = (Circle)joinPoint.getTarget();
	}*/
	
//	@Before("args(name)")
//	@After("args(name)")
	@AfterReturning(pointcut="args(name)", returning="returnString")
	/*public void stringArgumentMethods(String name, Object returnString) {
		System.out.println("A method that takes String arguments has been called. The value is: "+name
				+" The output value is "+returnString);
	}*/
	
	/*@AfterThrowing(pointcut="args(name)", throwing="ex")
	public void exceptionAdvice(String name, Exception ex) {
		System.out.println("An exception has been thrown "+ex);
	}*/
	
//	@Around("@annotation(com.morningstar.aop.aspect.Loggable)")
//	@Around("allGetters()")
	public Object myAroundAdvice(ProceedingJoinPoint proceedingJointPoint) {
		Object returnValue = null;
		try {
			System.out.println("Before advice");
			returnValue=proceedingJointPoint.proceed();
			System.out.println("After returning");
		}catch (Throwable ex) {
			System.out.println("After throwing");
		}
		System.out.println("After finally");
		return returnValue;
	}
	
	/*@Before("allGetters()")
	public void secondAdvice() {
		System.out.println("Second Advice Executed");
	}*/
	
	/*@Pointcut("execution(* get*())")
	public void allGetters() {
	}*/
	
//	..* wildcard everything 
	/*@Pointcut("within(com.morningstar.aop.model.Circle)")
	public void allCircleMethods() {
	}*/
	
	public void loggingAdvice() {
		System.out.println("Logging from the Advice");
	}
	
//	@Pointcut(args())
}
