package com.weikun.B;

public class G {//inner class
	
	class G0{
		G0(String name){
			this.name=name;
		}
		String name;
		private void go(){
			System.out.println(name);
		}
	}
	public void ok(){
		
		new G0("北京").go();
	}
	private int age=100;
	//属性 方法 {} 构造器  class

}
