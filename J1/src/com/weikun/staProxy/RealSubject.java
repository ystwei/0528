package com.weikun.staProxy;

public class RealSubject implements Subject {

	@Override
	public void say() {
		// TODO Auto-generated method stub
		System.out.println("��ð�");
	}

	@Override
	public void hello() {
		// TODO Auto-generated method stub
		System.out.println("�㳤����pretty");
	}

	@Override
	public void high() {
		// TODO Auto-generated method stub
		System.out.println("����߶���");
	}

}
