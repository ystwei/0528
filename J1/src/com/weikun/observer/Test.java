package com.weikun.observer;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConcreteSubject subject=new ConcreteSubject();
		subject.setMsg("MMÌ¸ĞÂÄĞÅóÓÑÁË");
		Observer o=new ConcreteObserver(subject,"mike");
		Observer o2=new ConcreteObserver(subject,"jack");
		Observer o3=new ConcreteObserver(subject,"tom");
		
		
		subject.atteach(o);
		subject.atteach(o2);
		subject.atteach(o3);
		
		subject.detteach(o3);
		subject.Notify();
		
		
	}

}
