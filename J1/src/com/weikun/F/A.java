package com.weikun.F;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.text.SimpleDateFormat;

public class A {
	public static void main(String[] args) {
		copyFile();
	}
	private static void copyFile(){
		FileInputStream fis=null;
		FileOutputStream fos=null;
		long start=System.currentTimeMillis();
		
		try {
			fis=new FileInputStream("c://1.wmv");
			
			fos=new FileOutputStream("D://2.wmv");
			
			byte[] buffer=new byte[1024*1024*1024];
			int n=-1;
			while(  (n=fis.read(buffer))!=-1){
				fos.write(buffer, 0, n);
			}
			
			long end=System.currentTimeMillis();
			
			SimpleDateFormat sdf=new SimpleDateFormat("ss");
			System.out.println(sdf.format(end-start));
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally{
			try {
				fos.flush();
				fos.close();
				fis.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}
	
	private static void writeFile(){
		
		OutputStream os=null;
		try {
			
			os=new FileOutputStream("src/16.txt");
			
			
			os.write("����FileInputStream��FileOutputStream".getBytes("utf-8"));
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally{
			try {
				os.flush();//һ���Եİ��ڴ��ֵ�����Ӳ����
				os.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}
	private static void readFile() {
		InputStream is=null;
		try {
			is=new FileInputStream("src/16.txt");
			byte buffer[]=new byte[1024];//ÿ�ζ����ļ����ݶ���������
			int n=-1;
			while(  (n=is.read(buffer))!=-1){//n����ÿһ�ζ�ȡ��������Ĵ�С
				System.out.println(new String(buffer,"utf-8"));
			}
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			
			try {
				is.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}//���ĸ��ļ���Ҫ���ж�д
	}
}
