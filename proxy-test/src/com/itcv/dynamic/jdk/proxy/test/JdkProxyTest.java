package com.itcv.dynamic.jdk.proxy.test;

import java.lang.reflect.Proxy;

import com.itcv.dynamic.jdk.proxy.Hello;
import com.itcv.dynamic.jdk.proxy.handler.DynamicProxyHandler;
import com.itcv.dynamic.jdk.proxy.impl.HelloImpl;

public class JdkProxyTest {
  
	public static void main(String[] args) {
        Hello proxy = (Hello) Proxy.newProxyInstance(ClassLoader.getSystemClassLoader(), new Class[]{Hello.class}, new DynamicProxyHandler(new HelloImpl()));
        proxy.say("ÀîÃ÷");
	}
}
