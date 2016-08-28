package com.weikun.single;

public class TestB {
	public static void main(String[] args) {
		
		B b=B.getInstance();
		B b1=B.getInstance();
		
		System.out.println(b);
		System.out.println(b1);
	}
}
