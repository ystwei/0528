package com.weikun.B;

import java.io.IOException;
import java.util.Date;

public class A {
	public static void main(String[] args) {
//		Date d=null;
//		//System.out.println(d.getDate());
//		System.out.println(args[0]);
//		System.out.println(args[1]);
		
		try {
			System.out.println("考试中");
			test();
			System.out.println("考完了，过了！");
			
		}catch (Exception e) {//多态
			// TODO: handle exception
			e.printStackTrace();
			String s=e.getMessage();
			if(s==null){
				System.out.println("请找习近平");
			}
		}finally{
			System.out.println("高兴与痛苦中！");
			
		}
		
		
	}
	public static void test(){
		Date d=null;
		System.out.println(d.getDate());
	}
}
