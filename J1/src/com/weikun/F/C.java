package com.weikun.F;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;

public class C {
	public static void main(String[] args) {
		new C().copyFile();
	}
	public void copyFile(){
		
		
		long start=System.currentTimeMillis();
		try (
				BufferedInputStream  bis=new BufferedInputStream(new FileInputStream("c://1.wmv"),1024*1024);
				BufferedOutputStream bos=new BufferedOutputStream(new FileOutputStream("d://3.wmv"),1024*1024)){
				
				byte[] buffer=new byte[1024*1024];
				
				int n=-1;
				while((n=bis.read(buffer)) !=-1){
					bos.write(buffer, 0, n);
				}
				long end=System.currentTimeMillis();
				
				SimpleDateFormat sdf=new SimpleDateFormat("ss");
				System.out.println(sdf.format((end-start)));
						
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}	
