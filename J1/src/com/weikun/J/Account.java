package com.weikun.J;

public class Account {
	private String accountNo;
	private double balance;
	
	private boolean flag=false;//false:没钱，可以存了，true：有钱，可以取了
	public Account(){}

	public Account(String accountNo , double balance){
		this.accountNo = accountNo;
		this.balance = balance;
	}

	public void setAccountNo(String accountNo){
		this.accountNo = accountNo;
	}
	public String getAccountNo(){
		return this.accountNo;
	}

	public double getBalance(){
		return this.balance;
	}
	/**取钱
	 * 
	 * @param money:取了多钱
	 */
	public synchronized void draw(double money){
		if(flag==false){//没钱了，
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}else{//可以取钱了，
			this.balance-=money;
			System.out.println("已经取了"+money+"钱");
			flag=false;//已经没钱了，可以存了。
			notifyAll();//唤醒所有被wait的线程
		}
	}
	/**
	 * 存钱，
	 * @param money：存了多少钱
	 */
	
	public synchronized void save(double money){
		if(flag==true){//有钱，不能存
			
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}else{//没钱，可以存
			this.balance+=money;
			System.out.println("已经存了"+money+"钱");
			flag=true;//有钱了，
			notifyAll();//所有线程
		}
	}
	
}
