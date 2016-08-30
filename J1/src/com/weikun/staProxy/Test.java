package com.weikun.staProxy;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Subject subject =new RealSubject();
		Proxy proxy=new Proxy(subject);
		
		proxy.say();
		proxy.hello();
		proxy.high();
	}

}
