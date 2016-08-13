package com.weikun.A;

public  class E extends  E0{
	public static void main(String[] args) {
		System.out.println(new E().getInterest());
		System.out.println(new E1().getInterest());
	}

	@Override
	public float getRate() {
		// TODO Auto-generated method stub
		return 0.1f;
	}

}
class E1 extends  E0{

	@Override
	public float getRate() {
		// TODO Auto-generated method stub
		return 0.2f;
	}
	
	
}
abstract class E0{
	private void plan(){
		
	}
	public int fund=100;
	public float getInterest(){//得到利息
		return this.fund*this.getRate();
	}
	abstract float getRate();
}