package com.weikun.B;

public class C {
	public static void main(String[] args) {
		try {
			new C().test(100);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("人的年龄不能到100");
		}
	}
	public void test(int old)throws Exception {
		
		if(old==100){
			
				throw new Exception();
			
		}
	}
}
