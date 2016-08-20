package com.weikun.F;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

public class D {
	public static void main(String[] args) {
		new D().myIn2();
	}
	
	public void myIn2(){
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));		
		boolean flag=true;
		while(flag){
			
			String line="";
			try {
				line = br.readLine();
				if(line.trim().toLowerCase().equals("q")){
					flag=false;
				}
				
				System.out.println(line);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			
			
			
		}
		try {
			br.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void myIn1(){
		
		try {
			
			InputStream in=System.in;
			
			boolean flag=true;
			byte buffer[]=new byte[1024];
			while(flag){			
				
				in.read(buffer);
				String line=new String(buffer);
				if(line.trim().toLowerCase().equals("q")){
					flag=false;
				}
				System.out.println(line);
				
			}
			
			
			
			in.close();
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	public void myIn(){
		try {
			Scanner sc=new Scanner(System.in);
			
			boolean flag=true;
			while(flag){
				
				String line=sc.next();
			
				String s="\r";
				if (line.trim().toLowerCase().equals("q")){
					flag=false;
					//System.exit(0);
				}
				String line1 =sc.nextLine();
				System.out.println(line);
				
			
				
			}
			sc.close();
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		
	}
}
