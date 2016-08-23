package com.weikun.K;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class B {
	public static void main(String[] args) {
		//ExecutorService service=Executors.newFixedThreadPool(5);
		//ExecutorService service=Executors.newSingleThreadExecutor();
		ExecutorService service=Executors.newCachedThreadPool();
		
		for(int i=0;i<15;i++){
			service.execute(new Runnable(){

				@Override
				public void run() {
					// TODO Auto-generated method stub
					System.out.println(Thread.currentThread().getName());
				}
				
				
				
			});
			
		}
		
		service.shutdown();
		try {
			service.awaitTermination(Long.MAX_VALUE, TimeUnit.DAYS);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	
	}
}
