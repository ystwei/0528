package com.weikun.decorator;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Girl g=new ChineseGirl();
		System.out.println(g.getDesc());
		
		
		Coding c=new Coding(g);
		System.out.println(c.getDesc());
		
		
		Game g1=new Game(c);
		System.out.println(g1.getDesc());
	}

}
