package com.weikun.G;

public class D {
	public static void main(String[] args) {
		D0 d0=new D0();
		d0.setName("D0");
		d0.start();
		
		
		for(int i=0;i<100;i++){
			if(i==10){
				D1 d3=new D1();
				d3.setName("D3");
				d3.start();
				try {
					d3.join();
				} catch (InterruptedException e) {//sleep join wait
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			System.out.println(Thread.currentThread().getName()+":"+i);
		}
	}
}
class D0 extends Thread{
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0;i<100;i++){
			if(i==10){
				D1 d1=new D1();
				d1.setName("D1");
				d1.start();
				try {
					d1.join();
				} catch (InterruptedException e) {//sleep join wait
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				
				D1 d2=new D1();
				d2.setName("D2");
				d2.start();
				try {
					d2.join();
				} catch (InterruptedException e) {//sleep join wait
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			System.out.println(Thread.currentThread().getName()+":"+i);
		}
	}
}
class D1 extends  Thread{
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0;i<100;i++){
			
			System.out.println(Thread.currentThread().getName()+":"+i);
		}
	}
}