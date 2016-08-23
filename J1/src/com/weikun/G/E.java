package com.weikun.G;

public class E {
	
	public static void main(String[] args) {
		E0 e0=new E0();
		e0.setName("E0");
		e0.start();
		
		
		E1 e1=new E1();
		e1.setName("E1");
		e1.setDaemon(true);// ÿª§œﬂ≥Ã
		e1.start();
	}
}
class E0 extends Thread{
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0;i<100;i++){
			try {
				Thread.currentThread().sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName()+":"+i);
		}
	}
}

class E1 extends Thread{
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0;i<10000;i++){
			try {
				Thread.currentThread().sleep(30);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName()+":"+i);
		}
	}
}