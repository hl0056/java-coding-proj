package com.java.design_12_proxy.dyn_proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class StarInvokation implements InvocationHandler {
	
	private ISingStar star;
	
	public StarInvokation(ISingStar star) {
		super();
		this.star = star;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		System.out.println("StarInvokation.invoke():�����ĸ���");
		
		int price = (Integer)args[0];
		
		if (price > 100000) {
			return method.invoke(star, args);
		} else {
			System.out.println("Ǯ̫��");
		}
		return null;
	}

}
