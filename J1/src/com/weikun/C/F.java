package com.weikun.C;

public class F {
	public static void main(String[] args) {
		F0 f0=new F0();
		f0.setOld(500);
		f0.setName("rose");
		
		
		F0 f1=new F0();
		
		
		f1.setOld(300);
		f1.setName("rose");
		
		System.out.println(f0.equals(f1));
	}
}
class F0{
	
	private String name="Jack";
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getOld() {
		return old;
	}
	public void setOld(int old) {
		this.old = old;
	}
	private int old=200;
	@Override
	public boolean equals(Object obj) {//true：想等 false：不相等
		// TODO Auto-generated method stub
		//1相同即相等
		if(this==obj){
			return true;			
		}
		if(obj==null){//2没有被比对象
			return false;
		}
		//3.他们根本不是一个品种
		if(this.getClass()!=obj.getClass()){
			return false;
		}
		//4开始每个属性的比较
		F0 f1=(F0)obj;
		return this.name.equals(f1.getName())&&this.old==f1.getOld();
		
		
		
	}
}
