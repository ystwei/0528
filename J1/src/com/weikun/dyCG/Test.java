package com.weikun.dyCG;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyProxy my=new MyProxy();
		
		Object o=my.getCoreClass(People.class);
		
		People p=(People)o;
		p.work();
		
	}

}
