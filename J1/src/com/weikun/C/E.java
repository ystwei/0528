package com.weikun.C;

import java.io.UnsupportedEncodingException;
import java.util.Date;

public class E {
	public static void main(String[] args) {
//		String s="wei".concat("kun");
//		System.out.println(s);
//		String c="a"+"b"+"c"+"d"+"e";
//		System.out.println(c);
//		
//		StringBuffer sb=new StringBuffer();
//		
//		StringBuilder sb1=new StringBuilder();
//		
//		
//		sb.append("a");//abcd
//		sb.append("b");
//		sb.append("c");
//		sb.append("d");
//		sb.insert(2, "F");//abFcd
//		sb.delete(1, 3);//acd
//		System.out.println(sb.substring(2, 3));//d
//		System.out.println(sb.reverse());//dca
		
		
//		String s=String.valueOf(1L);
//		try {
//			String s2=new String("我爱你中国".getBytes("ISO8859-1"),"UTF-8");
//			System.out.println(s2);
//		} catch (UnsupportedEncodingException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		String s="ABC";
//		String s1=new String("ABC");
//		int i=100;
//		
//		System.out.println(s==s1);
//		System.out.println(s.equals(s1));//比较其值是相等
//		String s="  ab";
//		String s1="abcf";
//		System.out.println(s.compareTo(s1));
		
		
		//String s="ABCDEFABCD";
//		/System.out.println(s.startsWith("1"));
	//	System.out.println(s.endsWith("oc"));
		//System.out.println(s.indexOf("CD",6));
		//System.out.println(s.lastIndexOf("AB",7));
		
		String s="A=B%C";
		String [] ss=s.split("=");
		for(int i=0;i<ss.length;i++){
			
			String [] s1=ss[1].split("%");
			
			for(String s2 :s1){
				System.out.println(s2);
			}
		}
		
	}
}
