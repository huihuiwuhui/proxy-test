package com.itcv.dynamic.cglib.proxy.test;

import com.itcv.dynamic.cglib.proxy.CglibProxy;
import com.itcv.dynamic.cglib.proxy.HelloCglib;

public class CglibTest {

	public static void main(String[] args) {
		 CglibProxy proxy = new CglibProxy();  
		  //ͨ����������ķ�ʽ����������  
		  HelloCglib proxyImp = (HelloCglib)proxy.getProxy(HelloCglib.class);  
		  proxyImp.say("����");
	}
}
