package com.sxt.aop.execution;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class TestServiceAdvisor {

	/**
	 * 自定义切点。
	 */
	@Pointcut(value="execution ( * com.sxt.aop.execution.*.*(..) )")
	public void executionPointcut(){}
	
	/**
	 * 应用切点executionPointcut。
	 * @throws Throwable
	 */
	@Before("executionPointcut()")
	public void executionBefore() throws Throwable {
		System.out.println("executionBefore method run");
	}
	
	@Pointcut(value="target ( com.sxt.aop.execution.TestService )")
	public void targetPointcut(){}
	
	@Before("targetPointcut()")
	public void targetBefore() throws Throwable {
		System.out.println("targetPointcut method run");
	}
	
	@Pointcut(value="within ( com.sxt.aop.execution.* )")
	public void withinPointcut(){}
	
	@Before("withinPointcut()")
	public void withinBefore() throws Throwable {
		System.out.println("withinBefore method run");
	}
	
	@Pointcut(value="this ( com.sxt.aop.execution.TestService )")
	public void thisPointcut(){}
	
	@Before("thisPointcut()")
	public void thisBefore() throws Throwable {
		System.out.println("thisPointcut method run");
	}
	
	@Pointcut(value="args ( java.lang.String )")
	public void argsPointcut(){}
	
	@Before("argsPointcut()")
	public void argsBefore() throws Throwable {
		System.out.println("argsPointcut method run");
	}
	
	/**
	 * @annotation ( 注解类型包名.类名 )
	 * 代表所有被此注解描述的方法都做为切点。
	 * 注解可以使用自定义或三方定义的注解。
	 */
	@Pointcut(value="@annotation ( com.sxt.aop.execution.LogAnnotation )")
	public void annotationPointcut(){}
	
	@Before("annotationPointcut()")
	public void annotationBefore() throws Throwable {
		System.out.println("annotationPointcut method run");
	}

}
