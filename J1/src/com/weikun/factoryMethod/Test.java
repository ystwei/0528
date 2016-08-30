package com.weikun.factoryMethod;

public class Test {
	public static void main(String[] args) {
		
		PotatoCreator pc=new PotatoCreator();
		pc.saleProduct().eat();
		
		
		HamburgerCreator hc=new HamburgerCreator();
		hc.saleProduct().eat();
		
	}
}

