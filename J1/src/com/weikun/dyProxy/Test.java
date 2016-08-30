/**
 * 
 */
package com.weikun.dyProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * @author Administrator
 *
 */
public class Test {
	public static void main(String[] args) {
		
		
		IAnimal a=new Cat();
		
		InvocationHandler my=new MyProxy(a);
		
		Object o=Proxy.newProxyInstance(a.getClass().getClassLoader(), a.getClass().getInterfaces(), my);
		
		if(o instanceof IAnimal){//��������Ƿ������IAnimal�ӿ�
			
			
			IAnimal a1=(IAnimal)o;
			
			a1.go();
			a1.eat();
		}
		
		
		
		
		IPeople p=new People();
		
		InvocationHandler my1=new MyProxy(p);
		
		Object o1=Proxy.newProxyInstance(p.getClass().getClassLoader(), p.getClass().getInterfaces(), my1);
		
		if(o1 instanceof IPeople){//��������Ƿ������IAnimal�ӿ�
			
			
			IPeople a2=(IPeople)o1;
			
			a2.speak();
			
		}
		
		
		
	}

}
