package com.itcv.sta.proxy.imp;

import com.itcv.sta.proxy.Hello;

/**
 * �ӿڵ�ʵ����
 * @author zf
 *
 */
public class HelloImpl implements Hello{

	@Override
	public void say(String name) {
		System.out.println("hello "+ name + ", This is HelloImpl");
	}

}
