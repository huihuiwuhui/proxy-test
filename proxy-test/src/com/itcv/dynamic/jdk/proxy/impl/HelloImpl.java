package com.itcv.dynamic.jdk.proxy.impl;

import com.itcv.dynamic.jdk.proxy.Hello;

/**
 * �ӿ�ʵ����
 * @author zf
 *
 */
public class HelloImpl implements Hello{

	@Override
	public void say(String name) {
		System.out.println("hello,"+name+",This is dynamic jdk HellImpl");
	}

}
