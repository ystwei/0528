package com.weikun.F;

import java.io.File;

public class G {
	public static void main(String[] args) {
		
		
		
//		String [] ss=f.list();
//		int count=0;
//		for(String s :ss){
//			System.out.println(s);
//			++count;
//		}
//		System.out.println(count);
		
		FindFile("C:\\");
	}

	private static void FindFile(String path) {
		File f=new File(path);
		File fs[]=f.listFiles();
		
		for(File f1 :fs){
			
			if((f1!=null)&&(f1.isDirectory())){
				FindFile(f1.getPath());
			}else{
				System.out.println(f1.getAbsolutePath());
			}
		}
	}
}
