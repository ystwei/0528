package com.weikun.E;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.ServerSocket;
import java.net.Socket;

public class ChatServer {
	//服务器端，接收端
	
	public static void main(String[] args) {
		ServerSocket server=null;
		Socket client=null;
		BufferedReader br=null;
		try {
			
			server=new ServerSocket(9081);
			System.out.println("服务器已经启动了！");
			client=server.accept();
			
			boolean flag=true;
			
			br=new BufferedReader(new InputStreamReader(client.getInputStream()));
			while(flag){
				String line=br.readLine();
				
				if(line.trim().toLowerCase().equals("q")){
					
					flag=false;
				}else{
					System.out.println(line);
					
				}
				
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally{
			try {
				br.close();
				client.close();
				server.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
