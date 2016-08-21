package com.weikun.F;

import java.io.BufferedReader;
import java.io.File;

import java.io.FileReader;
import java.io.FilenameFilter;


public class H {
	static String[] ss=new String[10];
	public static void main(String[] args) {
		File file=new File("src/suffix.txt");
		try {
			BufferedReader br=new BufferedReader(new FileReader(file));
			
			String line="";
			int i=0;
			while( (line=br.readLine())!=null){
				ss[i]=line;
			
				i++;
				
			}
			
			
			File f=new File("C:\\3000soft\\Red Spider");
			File[] fs=f.listFiles(new FilenameFilter(){

				@Override
				public boolean accept(File dir, String name) {
					// TODO Auto-generated method stub
					boolean flag=false;
					for(String s:ss){
						
						if((s!=null)&&(name.endsWith(s))){
							flag=true;
							break;
						}
					}
					
					
					return flag;
				}
				
				
				
			});
			
			for(File f1 :fs){
				System.out.println(f1.getName());
				
			}
			 
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
	}
}
