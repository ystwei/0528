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
			System.out.println("������");
			test();
			System.out.println("�����ˣ����ˣ�");
			
		}catch (Exception e) {//��̬
			// TODO: handle exception
			e.printStackTrace();
			String s=e.getMessage();
			if(s==null){
				System.out.println("����ϰ��ƽ");
			}
		}finally{
			System.out.println("������ʹ���У�");
			
		}
		
		
	}
	public static void test(){
		Date d=null;
		System.out.println(d.getDate());
	}
}
