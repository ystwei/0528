package com.weikun.simplefactory;

public class Creator {
	public IProduct makeProduct(int index){
		
		switch (index) {
		case 1:
			
			return new ProductA();
		case 2:
			
			return new ProductB();

			
		default:
			return null;
		}
		
		
	}
}
