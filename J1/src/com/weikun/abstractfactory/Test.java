package com.weikun.abstractfactory;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConcreteFactoryA a=new ConcreteFactoryA();
		a.createProductA().go();
		
		
		ConcreteFactoryB b=new ConcreteFactoryB();
		b.createProductB().go();
	}

}
