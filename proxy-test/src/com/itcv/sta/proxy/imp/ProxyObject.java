package com.itcv.sta.proxy.imp;

import com.itcv.sta.proxy.Hello;

/**
 * 代理对象
 * @author zf
 *
 */
public class ProxyObject implements Hello{
   
	private Hello hello;
	
	public ProxyObject(Hello hello){
		this.hello = hello;
	}
	
	@Override
	public void say(String name) {
		 hello.say(name);
		 doSomething();
	}
	
	public void doSomething(){
		System.out.println("I'm a proxyObject");
	}

}
