package com.weikun.I;

public class Account {
	private String accountNo;
	private double balance;//���


	public Account(){}

	public Account(String accountNo , double balance){
		this.accountNo = accountNo;
		this.balance = balance;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	
	
}
