package com.weikun.single;

public class A {
	private A(){
		
	}
	private static A a;
	public synchronized static  A getInstance(){
		
		if(a==null){//第一次访问
			a=new A();
		}
		return a;//非第一次访问
	}
}
