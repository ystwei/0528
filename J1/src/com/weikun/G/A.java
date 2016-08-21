package com.weikun.G;

public class A extends Thread {
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0;i<100;i++){
			
			try {
				Thread.currentThread().sleep(1);
				Thread.currentThread().yield();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName()+i);
		}
	}
	
	
	public static void main(String[] args) {
		A a=new A();
		a.setName("A:");
		//a.setPriority(NORM_PRIORITY);
		a.start();
		
		A a1=new A();
		a1.setName("B:");
		//a1.setPriority(NORM_PRIORITY+1);//10
		a1.start();
	}
}
