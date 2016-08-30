package com.weikun.staProxy;

public class Proxy implements Subject {
	
	
	public Subject subject;
	
	public Proxy(Subject subject){
		this.subject=subject;
	}
	@Override
	public void say() {
		// TODO Auto-generated method stub
		subject.say();
		System.out.println("�Һܺ�");
		
	}

	@Override
	public void hello() {
		// TODO Auto-generated method stub
		subject.hello();
		System.out.println("��Ҳ��");
	}
	@Override
	public void high() {
		// TODO Auto-generated method stub
		subject.high();
		System.out.println("����1.80��");
	}

}
