package com.weikun.K;

public class A implements Runnable {
	public static void main(String[] args) {
		
		new A().go();
		
	}
	public void go(){
		ThreadGroup p=new ThreadGroup("¸¸Ç×");
		
		Thread t1=new Thread(p,this);
		t1.setName("A");
		t1.start();
		
		
		Thread t2=new Thread(p,this);
		t2.setName("B");
		t2.start();
		
		
//		 Thread t[]=new Thread[p.activeCount()];
//		 p.enumerate(t);
//		 
//		 for(Thread ts :t){
//			 System.out.println(ts.getName());
//			 
//		 }
		 
		ThreadGroup s=new ThreadGroup(p,"¶ù×Ó");//¸¸Ç×°üº¬ÁË¶ù×Ó
		
		Thread t3=new Thread(s,this);
		t3.setName("C");
		t3.start();
		
		Thread t[]=new Thread[s.activeCount()];
		 p.enumerate(t);
		 
		 for(Thread ts :t){
			 System.out.println(ts.getName());
			 
		 }
	
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub

		for(int i = 0; i < 10; i++) {
			try {
				Thread.currentThread().sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println(Thread.currentThread().getName() + 
				" finished executing.");
	}
}
