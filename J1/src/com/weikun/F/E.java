package com.weikun.F;

import java.io.File;
import java.io.RandomAccessFile;

public class E {
	public static void main(String[] args) {
		new E().mergeFile();
	}
	
	public void mergeFile(){
		File file=new File("c://2.mp3");
		try (RandomAccessFile r=new RandomAccessFile("c://1.mp3", "r");
				RandomAccessFile w=new RandomAccessFile(file, "rw");){
			
			w.seek(file.length());//定位到2.mp3的最后
			
			int n=-1;
			byte[] buffer=new byte[1024];
			
			while( (n=r.read(buffer))!=-1){
				
				w.write(buffer, 0, n);
			}
			
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			
		}
		
	}
	public void copyFile(){
		try (RandomAccessFile r=new RandomAccessFile("src/1.txt", "r");
				RandomAccessFile w=new RandomAccessFile("d://2.txt", "rw");){
			
			int n=-1;
			byte buffer[]=new byte[1024];
			while( (n=r.read(buffer))!=-1){
				w.write(buffer, 0, n);
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			
		}
	}

}
