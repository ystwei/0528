package com.weikun.E;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.Socket;

public class FileClient {
	public static void main(String[] args) {
		Socket client=null;
		DataInputStream dis=null;
		DataOutputStream dos=null;	
		
		try {
			
			client=new Socket("192.168.3.15",9082);//ʵ��������
			
			dis=new DataInputStream(client.getInputStream());
			
			String filename=dis.readUTF();//�ļ�����
			
			File file=new File("d://"+filename);
			
			dos=new DataOutputStream(new FileOutputStream(file));//�����ļ�
			
			int n=-1;
			byte[] buffer=new byte[1024];
			
			while(  (n=dis.read(buffer))!=-1){//д�ļ�����
				
				dos.write(buffer, 0, n);
			}
			
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally{
			
			try {
				dos.flush();
				dos.close();
				dis.close();
				client.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
	}
}
