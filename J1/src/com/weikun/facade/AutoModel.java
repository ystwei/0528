package com.weikun.facade;

public class AutoModel {
	public void ok(){
		ModelA a=new ModelA();
		a.go();
		
		ModelB b=new ModelB();
		b.plan();
		
	}
	public static void main(String[] args) {
		new AutoModel().ok();
	}
}
