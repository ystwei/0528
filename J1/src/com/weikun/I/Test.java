package com.weikun.I;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account account=new Account("NO1234",800);
		new DrawMoney("��",account,100).start();
		new DrawMoney("��",account,200).start();
		new DrawMoney("��",account,800).start();
		new DrawMoney("��1",account,1800).start();
		new DrawMoney("��2",account,800).start();
		new DrawMoney("��3",account,800).start();
		new DrawMoney("��4",account,800).start();
	}

}
