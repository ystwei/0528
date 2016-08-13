package com.weikun.A;

import com.weikun.A.*;//include using import 

public class B extends A {
	public static int age=100;
	public static String country="中国";
	public static void plan(){
		System.out.println(age);		
	}
	public  B(){		
	}
	public void mark(){
		age=300;
	}
	public static void main(String[] args) {		
		B.age=200;
		B.plan();			
		B b=new B();		
		b.age=300;
		b.plan();		
		B b1=new B();
		System.out.println(b1.country);
		b1.country="日本";		
		B b2=new B();
		System.out.println(b2.country);
	}
}
