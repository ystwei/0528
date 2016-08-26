package com.weikun.K;

public class TestA {
	public static void main(String[] args) {
		Animal<Integer ,String> a=new Animal<Integer ,String>();
		a.setAge(100);
		a.setName("Gou");
		
		
		Animal<String,Integer> a1=new Animal<String,Integer>();
		a1.setAge("100");
		a1.setName(100);
	}
}
