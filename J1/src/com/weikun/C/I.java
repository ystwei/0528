package com.weikun.C;

public class I {
	public static void main(String[] args) {
//		go("");
//		go("",1);
//		go("",1,2,3,4,5);
		
		System.out.printf("%14.2s","weikun");
		
	}
	public static void go(String name,int ... a){
		for(int i :a){//a[2]
			System.out.println(i);
		}
	}
}
