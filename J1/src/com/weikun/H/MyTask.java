package com.weikun.H;

import java.util.Timer;
import java.util.TimerTask;

public class MyTask extends TimerTask {
	private int imgCount;//一共多少个图片
	private int imgCur;//当前图片的号码
	private Timer timer;
	
	public Timer getTimer() {
		return timer;
	}



	public void setTimer(Timer timer) {
		this.timer = timer;
	}



	public int getImgCount() {
		return imgCount;
	}



	public void setImgCount(int imgCount) {
		this.imgCount = imgCount;
	}



	@Override
	public void run() {
		// TODO Auto-generated method stub
		if(++imgCur<=this.imgCount){
			
			System.out.print("继续加载，当前是第"+this.imgCur+"张图片"+"\r");
		}else{//加载完毕
			timer.cancel();
			
			System.out.println("恭喜你，游戏加载成功");
		}
	}

}
