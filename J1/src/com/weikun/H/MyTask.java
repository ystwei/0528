package com.weikun.H;

import java.util.Timer;
import java.util.TimerTask;

public class MyTask extends TimerTask {
	private int imgCount;//һ�����ٸ�ͼƬ
	private int imgCur;//��ǰͼƬ�ĺ���
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
			
			System.out.print("�������أ���ǰ�ǵ�"+this.imgCur+"��ͼƬ"+"\r");
		}else{//�������
			timer.cancel();
			
			System.out.println("��ϲ�㣬��Ϸ���سɹ�");
		}
	}

}
