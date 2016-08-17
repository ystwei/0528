package com.weikun.C;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class J {
	public static void main(String[] args) {
		//符合2位小数 1.21 0.22 9 99.88 88888 .22 7.777 7.8888 9.999999
		String rex="^\\d*(\\.\\d{2,})?$";
//		String rex1="^[a-dm-p0-5]+@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*$";
//		
//		System.out.println("123p@163.com.cn".matches(rex1));//{n,m}
		
		Pattern p=Pattern.compile(rex);
		Matcher m=p.matcher("88888");
		System.out.println(m.matches());
		
		
//		String str="Hello,Java";
//		//贪婪模式的正则:数量表示符(*)会一种匹配下去，所以该字符串前面所有单词字符都被它匹配到，直到遇到空格
//		System.out.println(str.replaceFirst("\\w{2,3}", "■"));//■,Java
//		//勉强模式的正则：数量表示符(*)会尽量匹配最少字符，即匹配0个字符。
//		System.out.println(str.replaceFirst("\\w{3,4}?", "■"));//■Hello,Java
	}
}
