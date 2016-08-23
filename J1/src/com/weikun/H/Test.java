package com.weikun.H;

import java.util.Timer;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyTask my=new MyTask();
		my.setImgCount(10);
		
		Timer t=new Timer();
		
		my.setTimer(t);
		t.schedule(my, 1, 1000);
	}

}
