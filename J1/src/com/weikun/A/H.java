package com.weikun.A;

public class H extends H0{
	public void go(){
		System.out.println("ok1");
	}
	public void mark(){
		System.out.println("mark");
	}
	public IE exercise(int i){//返回值多态
		switch (i) {
		case 1:
			return new H1();
			
		case 2:
			return new H2();	
		default:
			return null;	
		}
	}
	public static void main(String[] args) {
//		H0 h=new H();//1虚方法调用,多态		
//		((H)h).mark();	
		
		
//		H h=new H();//2形参多态
//		h.plan(new H1());
//		
//		h.plan(new H2());
		
		
//		H h=new H();//返回值多态
//		h.exercise(1).ok();
//		h.exercise(2).ok();
		
		String [] str = new String[2];
		String  s[]={"哈尔滨"};
		if (str instanceof String[]){
			System.out.print("true");
		}
	}
	public void plan(IE h1){
		h1.ok();
	}
	
}
class H0{
	public void go(){
		System.out.println("ok");
	}
}
interface IE{
	void ok();
}

class H1 implements IE{

	@Override
	public void ok() {
		// TODO Auto-generated method stub
		System.out.println("888");
	}
	
}
class H2 implements IE{

	@Override
	public void ok() {
		// TODO Auto-generated method stub
		System.out.println("666");
	}
	
}
