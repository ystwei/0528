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
		System.out.println("我很好");
		
	}

	@Override
	public void hello() {
		// TODO Auto-generated method stub
		subject.hello();
		System.out.println("你也是");
	}
	@Override
	public void high() {
		// TODO Auto-generated method stub
		subject.high();
		System.out.println("我是1.80米");
	}

}
