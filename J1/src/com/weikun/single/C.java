package com.weikun.single;

public class C {
	
	private static volatile C c;
	private C(){
		
	}
	public static C getInstance(){
		if(c==null){
			
			synchronized (C.class) {
				c=new C();
			}
		}
		return c;
	}
}
