package com.weikun.J;

public class Account {
	private String accountNo;
	private double balance;
	
	private boolean flag=false;//false:ûǮ�����Դ��ˣ�true����Ǯ������ȡ��
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
	/**ȡǮ
	 * 
	 * @param money:ȡ�˶�Ǯ
	 */
	public synchronized void draw(double money){
		if(flag==false){//ûǮ�ˣ�
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}else{//����ȡǮ�ˣ�
			this.balance-=money;
			System.out.println("�Ѿ�ȡ��"+money+"Ǯ");
			flag=false;//�Ѿ�ûǮ�ˣ����Դ��ˡ�
			notifyAll();//�������б�wait���߳�
		}
	}
	/**
	 * ��Ǯ��
	 * @param money�����˶���Ǯ
	 */
	
	public synchronized void save(double money){
		if(flag==true){//��Ǯ�����ܴ�
			
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}else{//ûǮ�����Դ�
			this.balance+=money;
			System.out.println("�Ѿ�����"+money+"Ǯ");
			flag=true;//��Ǯ�ˣ�
			notifyAll();//�����߳�
		}
	}
	
}
