package com.weikun.F;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Test {
	public static void main(String[] args) {
	
//		new Test().read();
		
		File f=new File("c://wk1");
		if(f.exists()==false){
			
				//f.createNewFile();
				f.mkdir();
			
		}
		System.out.println(f.exists());
		System.out.println(f.isFile());
		System.out.println(f.isDirectory());
		System.out.println(f.getName());
		System.out.println(f.getPath());
		System.out.println(f.getParent());
		
	}
	public void read(){
		ObjectInputStream ois=null;
		try {
			ois=new ObjectInputStream(new FileInputStream("c://4.obj"));
			
			Cat c=(Cat)ois.readObject();
			
			System.out.println(c.getName());
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally{
			try {
				ois.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}
	public void writer(){
		ObjectOutputStream os=null;
		try {
			os=new ObjectOutputStream(new FileOutputStream("c://5.obj"));
			
			Cat c=new Cat(100,"»¨Ã¨");
			
			os.writeObject(c);
			
			
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally{
			try {
				os.flush();
				os.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
			
		}
	}
}
