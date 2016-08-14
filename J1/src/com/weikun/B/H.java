package com.weikun.B;

public class H {//方法内部类
	public void go(){
		int age=100;
		
		class H0{
			public void mark(String name){
				System.out.println(name);
			}
		}
		new H0().mark("北京");
		
	}
	
}
