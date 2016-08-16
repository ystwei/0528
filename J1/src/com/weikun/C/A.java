package com.weikun.C;

public class A  {

	public static void main(String[] args) {
		
		
//		new IA(){//1实例化匿名内部类
//
//			@Override
//			public void go() {
//				// TODO Auto-generated method stub
//				System.out.println("ok111");
//			}
//			
//		}.go();
//		
//		A a=new A();//2.形参匿名内部类
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
//		},"北京");
		
		
		
		
		A a=new A();//3返回值匿名内部类
		a.plan().go("上海");
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