package com.weikun.A;

public class G extends G1 implements IB  {

	@Override
	public void mark() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void go() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void plan() {
		// TODO Auto-generated method stub
		
	}

}
class G1{
	
}
interface IB extends IC,ID{
	void go();
}
interface IC{
	void mark();
}
interface ID{
	void plan();
}
