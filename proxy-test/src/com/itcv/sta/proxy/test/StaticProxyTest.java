package com.itcv.sta.proxy.test;

import com.itcv.sta.proxy.imp.HelloImpl;
import com.itcv.sta.proxy.imp.ProxyObject;

/**
 * �����������
 * @author zf
 *
 */
public class StaticProxyTest {
     
	public static void main(String[] args) {
		ProxyObject proxy = new ProxyObject(new HelloImpl());
		proxy.say("����");
	}
	
}
