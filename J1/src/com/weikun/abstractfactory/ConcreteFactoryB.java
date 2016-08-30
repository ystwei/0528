package com.weikun.abstractfactory;

public class ConcreteFactoryB implements AbstractFactory {

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
