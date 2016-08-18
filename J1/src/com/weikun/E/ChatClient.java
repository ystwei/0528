package com.weikun.E;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class ChatClient {
	public static void main(String[] args) {
		Socket client=null;
		PrintWriter out=null;
		Scanner sc=null;
		try {
			client=new Socket("127.0.0.1",9081);
			out=new PrintWriter(client.getOutputStream(),true);
			
			sc=new Scanner(System.in);
			
			while(sc.hasNext()){
				String txt=sc.nextLine();
				out.println(txt);
			}
			
			
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally{
			try {
				sc.close();
				out.close();
				client.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
