package com.weikun.C;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class J {
	public static void main(String[] args) {
		//����2λС�� 1.21 0.22 9 99.88 88888 .22 7.777 7.8888 9.999999
		String rex="^\\d*(\\.\\d{2,})?$";
//		String rex1="^[a-dm-p0-5]+@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*$";
//		
//		System.out.println("123p@163.com.cn".matches(rex1));//{n,m}
		
		Pattern p=Pattern.compile(rex);
		Matcher m=p.matcher("88888");
		System.out.println(m.matches());
		
		
//		String str="Hello,Java";
//		//̰��ģʽ������:������ʾ��(*)��һ��ƥ����ȥ�����Ը��ַ���ǰ�����е����ַ�������ƥ�䵽��ֱ�������ո�
//		System.out.println(str.replaceFirst("\\w{2,3}", "��"));//��,Java
//		//��ǿģʽ������������ʾ��(*)�ᾡ��ƥ�������ַ�����ƥ��0���ַ���
//		System.out.println(str.replaceFirst("\\w{3,4}?", "��"));//��Hello,Java
	}
}
