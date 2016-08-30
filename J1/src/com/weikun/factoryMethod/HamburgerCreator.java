package com.weikun.factoryMethod;

public class HamburgerCreator implements Creator{

	@Override
	public Product saleProduct() {
		// TODO Auto-generated method stub
		return new Hamburger();
	}

}
