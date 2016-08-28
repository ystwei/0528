package com.weikun.observer;

public class ConcreteObserver extends Observer {
	
	
	private ConcreteSubject subject;
	private String name;
	public ConcreteObserver(ConcreteSubject subject,String name){
		
		this.subject=subject;
		this.name=name;
	}
	
	
	
	public ConcreteSubject getSubject() {
		return subject;
	}



	public void setSubject(ConcreteSubject subject) {
		this.subject = subject;
	}



	@Override
	public void update() {
		// TODO Auto-generated method stub
		
		String msg=this.subject.getMsg();
		
		System.out.println("这个"+msg+"被"+this.name+"看到了");
		
		
	}

}
