package com.weikun.nio;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class A {
	public static void main(String[] args) {
		Path p=Paths.get("c://2//3//1.png");
		System.out.println(p.getFileName());
		System.out.println(p.getNameCount());//Ŀ¼�ļ���
		
		System.out.println("��·����"+p.getParent());//��һ��
		System.out.println("��·����"+p.getRoot());//����
		
		System.out.println(p.subpath(2,3));//�õ��ڶ���Ԫ��·��
		
		Path normalizedPath=Paths.get("./Listing_2_1.java").normalize();
		
		System.out.println(normalizedPath);
		
		
		try {
			Path realPath=Paths.get("src/11.txt").toRealPath();
			System.out.println(realPath);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Path prefix=Paths.get("/uat/");
		Path completePath=prefix.resolve("conf/application.properties");
		System.out.println(prefix.resolve(completePath));
		
	}
}
