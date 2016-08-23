package com.weikun.I;



public class DrawMoney extends Thread{

	//ģ���û��˻�
	private Account account;
	//��ǰȡǮ�߳���ϣ��ȡ��Ǯ��
	private double drawAmount;
	/**
	 * 
	 * @param name
	 * @param account
	 * @param drawAmount
	 */
	public DrawMoney(String name , Account account , 
			double drawAmount)//name:˭ȡ account��ȡ�ĸ� drawAmount��ȡ����
	{
		super(name);
		this.account = account;
		this.drawAmount = drawAmount;
	}
	@Override
	public  void run() {
		// TODO Auto-generated method stub
		synchronized(account){
			if(account.getBalance()>=this.drawAmount){//����ȡ				
				account.setBalance(account.getBalance()-this.drawAmount);
				System.out.println(this.getName()+"ȡ��"+this.drawAmount);
			}else{
				System.out.println("���㣬����ȡǮ");
			}
		}
		
	}
}
