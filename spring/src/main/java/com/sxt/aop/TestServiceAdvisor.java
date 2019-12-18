package com.sxt.aop;

import java.lang.reflect.Method;
import java.util.Arrays;

import org.springframework.aop.MethodBeforeAdvice;

public class TestServiceAdvisor implements MethodBeforeAdvice {

	@Override
	public void before(Method method, Object[] args, Object target) throws Throwable {
		System.out.println("before advice run [ method name : " + method.getName()
				+ " , args : ( " + Arrays.toString(args) + " )"
				+ " , target : " + target
				+ " , target class name : " + target.getClass().getName()
				+ " ] ");
	}

}
