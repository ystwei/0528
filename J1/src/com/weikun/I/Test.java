package com.weikun.I;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account account=new Account("NO1234",800);
		new DrawMoney("¼×",account,100).start();
		new DrawMoney("ÒÒ",account,200).start();
		new DrawMoney("±û",account,800).start();
		new DrawMoney("±û1",account,1800).start();
		new DrawMoney("±û2",account,800).start();
		new DrawMoney("±û3",account,800).start();
		new DrawMoney("±û4",account,800).start();
	}

}
