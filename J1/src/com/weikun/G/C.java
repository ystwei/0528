package com.weikun.G;

public class C {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t=new Thread(new Runnable(){

			@Override
			public void run() {
				// TODO Auto-generated method stub
				for(int i=0;i<100;i++){
					
						Thread.currentThread().interrupt();
					
					System.out.println(Thread.currentThread().getName()+i);
				}
			}
			
			
			
		});
		t.setName("A:");
		t.start();
		
		
		
		
		Thread t1=new Thread(new Runnable(){

			@Override
			public void run() {
				// TODO Auto-generated method stub
				for(int i=0;i<100;i++){
					
					System.out.println(Thread.currentThread().getName()+i);
				}
			}
			
			
			
		});
		t1.setName("B:");
		t1.start();
	}

}
