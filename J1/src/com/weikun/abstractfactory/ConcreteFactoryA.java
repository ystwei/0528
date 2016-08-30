package com.weikun.abstractfactory;

public class ConcreteFactoryA implements AbstractFactory {

	@Override
	public Product createProductA() {
		// TODO Auto-generated method stub
		return new ProductA();
	}

	@Override
	public Product createProductB() {
		// TODO Auto-generated method stub
		return new ProductB();
	}

}
