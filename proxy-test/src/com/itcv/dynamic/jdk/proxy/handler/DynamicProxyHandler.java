package com.itcv.dynamic.jdk.proxy.handler;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

import com.itcv.dynamic.jdk.proxy.Hello;

public class DynamicProxyHandler implements InvocationHandler{

	private Object realObject;
	
    public DynamicProxyHandler(Object realObject) {
    	this.realObject = realObject;
	}
	
	@Override
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		System.out.println("Before invocation");
		Object retVal = method.invoke(realObject, args);
		System.out.println("After invocation");
		return retVal; 
	 
	}

}
