package com.weikun.factoryMethod;

public class PotatoCreator implements Creator {

	@Override
	public Potato saleProduct() {
		// TODO Auto-generated method stub
		return new Potato();
	}
	
}
