package com.weikun.E;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class FileServer {//�����ļ���
	
	public static void main(String[] args) {
		
		ServerSocket server=null;
		Socket client=null;
		DataInputStream dis=null;
		DataOutputStream dos=null;
		
		try {
			
			server=new ServerSocket(9082);
			File file=new File("c://2.mp3");
			
			dis=new DataInputStream(new BufferedInputStream(new FileInputStream(file)));
			
			client=server.accept();
			dos=new DataOutputStream(client.getOutputStream());
			
			//1�����ļ���
			dos.writeUTF(file.getName());
			
			dos.flush();
			
			
			//2.��������
			byte buffer[]=new byte[1024];//����
			int n=-1;//��ȡ�Ļ������ݴ�С
			while( (n=dis.read(buffer))!=-1 ){//��=-1������������Ҫ��ȡ��==-1�Ѿ���ĩβ��
				
				dos.write(buffer, 0, n);
				
			}
			
			System.out.println("ok");
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally{
			
			try {
				dos.flush();
				dos.close();				
				dis.close();
				client.close();
				server.close();
				
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
