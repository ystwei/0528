package com.weikun.dyCG;

import java.lang.reflect.Method;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

public class MyProxy implements MethodInterceptor {
	
	public Object getCoreClass(Class c){
		Enhancer en=new Enhancer();
		
		en.setSuperclass(c);
		en.setCallback(this);
		return en.create();
		
	}
	
	
	@Override
	public Object intercept(Object arg0, Method arg1, Object[] arg2, MethodProxy arg3) throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("之前的代理器");
		arg3.invokeSuper(arg0, arg2);
		System.out.println("之后的代理器");
		return null;
	}

}
