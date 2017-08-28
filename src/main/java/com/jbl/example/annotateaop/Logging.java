package com.jbl.example.annotateaop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

import org.apache.log4j.Logger;

import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Around;

@Aspect
public class Logging {
	
	private Logger logger = Logger.getLogger(Logging.class);

   @Pointcut("execution(* com.jbl.example.annotateaop.Exerciser.before(..))")
   private void selectBefore(){}

   @Pointcut("execution(* com.jbl.example.annotateaop.Exerciser.after(..))")
   private void selectAfter(){}

   @Pointcut("execution(* com.jbl.example.annotateaop.Exerciser.around(..))")
   private void selectAround(){}

   @Pointcut("execution(* com.jbl.example.annotateaop.Exerciser.returnValue(..))")
   private void selectReturnValue(){}

   @Pointcut("execution(* com.jbl.example.annotateaop.Exerciser.*(..))")
   private void selectAll(){}

   /** 
      * This is the method which I would like to execute
      * before a selected method execution.
   */
   @Before("selectBefore()")
   public void beforeAdvice(){
      logger.info("Before Advice");
   }

   /** 
      * This is the method which I would like to execute
      * after a selected method execution.
   */
   @After("selectAfter()")
   public void afterAdvice(){
      logger.info("After Advise");
   }
   
   /**
    * This is the method which I would like to execute
    * before and after execution
   */
   @Around("selectAround()")
   public void AroundAdvice(ProceedingJoinPoint joinPoint) throws Throwable {
	   logger.info("Around Advice - pre call");
	   
	   // You have to explicitly call the joinPoint method, if you want to
	   joinPoint.proceed();
	   
	   logger.info("Around Advice - post to call");
	   
   }
   /** 
      * This is the method which I would like to execute
      * when any method returns.
   */
   @AfterReturning(pointcut = "selectReturnValue()", returning = "retVal")
   public void afterReturningAdvice(Object retVal){
      logger.info("Return Advise:" + retVal.toString() );
   }

   /**
      * This is the method which I would like to execute
      * if there is an exception raised by any method.
   */
   @AfterThrowing(pointcut = "selectAll()", throwing = "ex")
   public void AfterThrowingAdvice(Exception ex){
      logger.info("Exception Advise: " + ex.toString());   
   }


}