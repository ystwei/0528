package com.weikun.staProxy;

public class RealSubject implements Subject {

	@Override
	public void say() {
		// TODO Auto-generated method stub
		System.out.println("你好啊");
	}

	@Override
	public void hello() {
		// TODO Auto-generated method stub
		System.out.println("你长得真pretty");
	}

	@Override
	public void high() {
		// TODO Auto-generated method stub
		System.out.println("你身高多少");
	}

}
