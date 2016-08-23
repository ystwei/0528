package com.weikun.J;

/**
 * Description:
 * <br/>Copyright (C), 2008-2010, weikun
 * <br/>This program is protected by copyright laws.
 * <br/>Program Name:
 * <br/>Date:
 * @author  weikun@163.com
 * @version  1.0
 */
//取款
public class DrawThread extends Thread{
	//模拟用户账户
	private Account account;
	//当前取钱线程所希望取的钱数
	private double drawAmount;

	public DrawThread(String name , Account account , 
		double drawAmount){
		super(name);
		this.account = account;
		this.drawAmount = drawAmount;
	}

	//重复100次执行取钱操作
	public void run(){
		for (int i = 0 ; i < 10 ; i++ ){
			try {
				Thread.currentThread().sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			account.draw(drawAmount);
		}
	}
}