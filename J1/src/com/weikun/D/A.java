package com.weikun.D;

import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

import org.weikun.A.Animal;
import org.weikun.B.Cat;

public class A {//���������������ֶ�
	public static void main(String[] args) {		
		reflectArray();		
		
	}
	
	private static void reflectArray() {//��������
		
		Object o=Array.newInstance(String.class, 10)		;
		
		Array.set(o, 0, "���");
		Array.set(o, 1, "���1");
		Array.set(o, 2, "���2");
		Array.set(o, 3, "���3");
		
		
		String [] ss={"���","���1"};
		System.out.println(Array.get(o, 1));
		
		
		
	}
	private static void reflectClass() {//�����ڲ���
		try {
			Class c=Class.forName("org.weikun.B.Cat$Cat0");
			
			Constructor c1=c.getDeclaredConstructor(new Class[]{Cat.class});
			
			Object o=c1.newInstance(new Cat());
			
			Method m=c.getMethod("ok", String.class);
			
			m.invoke(o, "���");
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}
	private static void reflectField() {//�����ֶ�
		
		try {
			
			Class c=Class.forName("org.weikun.A.Animal");
			Object o=c.newInstance();
			
			Field name=c.getDeclaredField("name");
			name.setAccessible(true);
			
			name.set(o, "ʨ��");
			
			
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
	private static void reflectMethod() {//���䷽����Ա
		try {
			
			Class c=Class.forName("org.weikun.A.Animal");
			Object o=c.newInstance();
			
			Method m=c.getMethod("setName", String.class);
			
			m.invoke(o, "��");//setName(��)
			
			Method m1=c.getMethod("getName");
			
			System.out.println(m1.invoke(o));//getName()
			
//			Method ms[]=c.getMethods();//�����ص������й�������������Object�µ�
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
	private static void reflectContructor() {//�����Ĭ�Ϲ�����
		try {			
			
			Class c=Class.forName("org.weikun.A.Animal");
			Constructor c1=c.getConstructor(int.class,String.class);//�õ����Ĭ�Ϲ�����
			Animal a=(Animal)c1.newInstance(100,"����");
			
			System.out.println(a.getName());
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}
	private static void reflectDefaultContructor() {//����Ĭ�Ϲ�����
		try {
			Class c=Class.forName("org.weikun.A.Animal");//1�õ�������ʱ��
			
			Animal a=(Animal)c.newInstance();//2.�õ���һ��ʵ������
			
			a.setName("è");
			System.out.println(a.getName());
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
