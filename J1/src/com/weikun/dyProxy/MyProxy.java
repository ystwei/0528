package com.weikun.dyProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class MyProxy implements InvocationHandler {
	
	private Object obj;
	public MyProxy(Object obj){
		this.obj=obj;
	}
	
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		// TODO Auto-generated method stub
		
		System.out.println("之前的代理器");
		method.invoke(obj, args);//核心方法 go eat
		System.out.println("之后的代理器");
		return null;
	}

}
