package com.weikun.single;

public class A {
	private A(){
		
	}
	private static A a;
	public synchronized static  A getInstance(){
		
		if(a==null){//��һ�η���
			a=new A();
		}
		return a;//�ǵ�һ�η���
	}
}
