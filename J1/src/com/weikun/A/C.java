package com.weikun.A;

public class C extends C0 {
	static int age=10;	
	static{//��һ���ص�ʱ��ִ��//��̬��ʼ����		
		System.out.println("1");//7651423  7146523
	}
	{//��̬��ʼ����
		System.out.println("2");
	}
	C(){
		System.out.println("3");
	}
	static{//��һ���ص�ʱ��ִ��//��̬��ʼ����		
		System.out.println("4");
	}public static void main(String[] args) {
		C c=new C();	
		
		C c1=new C();//6523
	}
}
class C0{
	C0(){
		System.out.println("5");				
	}
	{
		System.out.println("6");		
	}
	static{		
		System.out.println("7");
	}
}
