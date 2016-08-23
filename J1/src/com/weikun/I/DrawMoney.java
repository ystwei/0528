package com.weikun.I;



public class DrawMoney extends Thread{

	//模拟用户账户
	private Account account;
	//当前取钱线程所希望取的钱数
	private double drawAmount;
	/**
	 * 
	 * @param name
	 * @param account
	 * @param drawAmount
	 */
	public DrawMoney(String name , Account account , 
			double drawAmount)//name:谁取 account：取哪个 drawAmount：取多少
	{
		super(name);
		this.account = account;
		this.drawAmount = drawAmount;
	}
	@Override
	public  void run() {
		// TODO Auto-generated method stub
		synchronized(account){
			if(account.getBalance()>=this.drawAmount){//可以取				
				account.setBalance(account.getBalance()-this.drawAmount);
				System.out.println(this.getName()+"取了"+this.drawAmount);
			}else{
				System.out.println("余额不足，不能取钱");
			}
		}
		
	}
}
