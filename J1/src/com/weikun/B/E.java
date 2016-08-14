package com.weikun.B;

public class E {
	public static void main(String[] args) {
		new E().ok();
	}
	public void ok(){
		int old=100;
		if(old<18){
			try {
				throw new MyException1(old);//你的年龄太小了，不能看这个网站
			} catch (MyException1 e) {
				// TODO Auto-generated catch block
				System.out.println(e.toString());
			}
		}else if(old>90){
			try {
				throw new MyException2(old);//你的年龄太大了，也不能看这个网站
			} catch (MyException2 e) {
				// TODO Auto-generated catch block
				System.out.println(e.toString());
			}
		}else{
			System.out.println("可以观看");
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
		return "你的年龄:"+this.old+"太小了，不能看这个网站";
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
		return  "你的年龄:"+this.old+"太大了，不能看这个网站";
	}
	
}
