package com.weikun.C;

public class A  {

	public static void main(String[] args) {
		
		
//		new IA(){//1ʵ���������ڲ���
//
//			@Override
//			public void go() {
//				// TODO Auto-generated method stub
//				System.out.println("ok111");
//			}
//			
//		}.go();
//		
//		A a=new A();//2.�β������ڲ���
//		a.mark(new IA(){
//
//			@Override
//			public void go(String name) {
//				// TODO Auto-generated method stub
//				System.out.println(name);
//			}
//			
//			
//			
//		},"����");
		
		
		
		
		A a=new A();//3����ֵ�����ڲ���
		a.plan().go("�Ϻ�");
	}
	public IA plan(){
		
		return new IA(){

			@Override
			public void go(String name) {
				// TODO Auto-generated method stub
				System.out.println(name);
			}
			
			
			
			
		};
	}
	public void mark(IA ia,String name){
		ia.go(name);
	}

}

interface IA{
	public void go(String name);
}