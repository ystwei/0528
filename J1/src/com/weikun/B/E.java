package com.weikun.B;

public class E {
	public static void main(String[] args) {
		new E().ok();
	}
	public void ok(){
		int old=100;
		if(old<18){
			try {
				throw new MyException1(old);//�������̫С�ˣ����ܿ������վ
			} catch (MyException1 e) {
				// TODO Auto-generated catch block
				System.out.println(e.toString());
			}
		}else if(old>90){
			try {
				throw new MyException2(old);//�������̫���ˣ�Ҳ���ܿ������վ
			} catch (MyException2 e) {
				// TODO Auto-generated catch block
				System.out.println(e.toString());
			}
		}else{
			System.out.println("���Թۿ�");
		}		
	}
}
class MyException1 extends Exception{
	private int old;
	public MyException1(int old) {
		// TODO Auto-generated constructor stub
		this.old=old;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "�������:"+this.old+"̫С�ˣ����ܿ������վ";
	}
}
class MyException2 extends Exception{
	private int old;
	public MyException2(int old) {
		// TODO Auto-generated constructor stub
		this.old=old;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return  "�������:"+this.old+"̫���ˣ����ܿ������վ";
	}
	
}
