package com.weikun.F;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

public class B {
	public static void main(String[] args) {
		new B().copyFile();
	}
	private static void copyFile(){
		Reader r=null;
		Writer w=null;
		try {
			
			r=new FileReader("src/15.txt");
			w=new FileWriter("d://15.txt");
			
			
			int n=-1;
			char[] buffer=new char[1024];
			
			
			while((n=r.read(buffer))!=-1){
				w.write(buffer, 0, n);
				
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally{
			
			try {
				w.flush();
				w.close();
				r.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		}
		
	}
	public void writeFile(){
		Writer w=null;
		try {
			w=new FileWriter("c://4.txt",true);
			
			w.write("ÎÒ°®ÄãºÚÁú½­£¡");
			
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			
		}finally{
			
			try {
				w.flush();
				w.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}
	public void readFile(){
		Reader r=null;
		try {
			r=new FileReader("src/1.txt");
			
			char [] buffer=new char[1024];
			int n=-1;
			while(  (n=r.read(buffer))!=-1){
				System.out.println(new String(buffer).trim());
			}
			
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally{
			try {
				r.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		}
	}
}
