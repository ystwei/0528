package com.weikun.D;

import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

import org.weikun.A.Animal;
import org.weikun.B.Cat;

public class A {//构造器，方法，字段
	public static void main(String[] args) {		
		reflectArray();		
		
	}
	
	private static void reflectArray() {//反射数组
		
		Object o=Array.newInstance(String.class, 10)		;
		
		Array.set(o, 0, "你好");
		Array.set(o, 1, "你好1");
		Array.set(o, 2, "你好2");
		Array.set(o, 3, "你好3");
		
		
		String [] ss={"你好","你好1"};
		System.out.println(Array.get(o, 1));
		
		
		
	}
	private static void reflectClass() {//反射内部类
		try {
			Class c=Class.forName("org.weikun.B.Cat$Cat0");
			
			Constructor c1=c.getDeclaredConstructor(new Class[]{Cat.class});
			
			Object o=c1.newInstance(new Cat());
			
			Method m=c.getMethod("ok", String.class);
			
			m.invoke(o, "你好");
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}
	private static void reflectField() {//反射字段
		
		try {
			
			Class c=Class.forName("org.weikun.A.Animal");
			Object o=c.newInstance();
			
			Field name=c.getDeclaredField("name");
			name.setAccessible(true);
			
			name.set(o, "狮子");
			
			
			System.out.println(name.get(o));
			
//			Field fs[]=c.getDeclaredFields();//c.getFields();//
//			
//			for(Field f :fs){
//				System.out.println(f.getName());
//			}
			
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			
		}finally{
			
		}
	}
	private static void reflectMethod() {//反射方法成员
		try {
			
			Class c=Class.forName("org.weikun.A.Animal");
			Object o=c.newInstance();
			
			Method m=c.getMethod("setName", String.class);
			
			m.invoke(o, "猪");//setName(猪)
			
			Method m1=c.getMethod("getName");
			
			System.out.println(m1.invoke(o));//getName()
			
//			Method ms[]=c.getMethods();//他返回的是所有公共方法，包括Object下的
//			
//			for(Method m :ms){
//				
//				System.out.println(m.getName());
//				
//			}
			
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		
	}
	private static void reflectContructor() {//反射非默认构造器
		try {			
			
			Class c=Class.forName("org.weikun.A.Animal");
			Constructor c1=c.getConstructor(int.class,String.class);//得到其非默认构造器
			Animal a=(Animal)c1.newInstance(100,"鹦鹉");
			
			System.out.println(a.getName());
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}
	private static void reflectDefaultContructor() {//反射默认构造器
		try {
			Class c=Class.forName("org.weikun.A.Animal");//1得到其运行时类
			
			Animal a=(Animal)c.newInstance();//2.得到了一个实例对象
			
			a.setName("猫");
			System.out.println(a.getName());
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
