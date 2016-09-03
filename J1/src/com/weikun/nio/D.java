package com.weikun.nio;

import java.io.IOException;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.StandardWatchEventKinds;
import java.nio.file.WatchEvent;
import java.nio.file.WatchKey;
import java.nio.file.WatchService;

public class D {
	public static void main(String[] args) {
		//1�õ��ļ���������
		
		watchDelete();
		watchCreate();
		
	
	}

	private static void watchCreate() {
		try {
			WatchService ws=FileSystems.getDefault().newWatchService();
			
			Path p=FileSystems.getDefault().getPath("c://");
			
			WatchKey wk=p.register(ws, StandardWatchEventKinds.ENTRY_CREATE);
			boolean flag=true;
			while(flag){
				wk=ws.take();//ִ�м��������ص�ǰ�ļ���key
				for(WatchEvent we   :wk.pollEvents()){
					if(we.kind()==StandardWatchEventKinds.ENTRY_CREATE){
						System.out.println("����������");
					}
				}
				wk.reset();
				
				flag=false;
			}
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	private static void watchDelete() {
		try {
			WatchService ws=FileSystems.getDefault().newWatchService();
			
			Path p=FileSystems.getDefault().getPath("c://");
			
			WatchKey wk=p.register(ws, StandardWatchEventKinds.ENTRY_DELETE);
			boolean flag=true;
			while(flag){
				wk=ws.take();//ִ�м��������ص�ǰ�ļ���key
				for(WatchEvent we   :wk.pollEvents()){
					if(we.kind()==StandardWatchEventKinds.ENTRY_DELETE){
						System.out.println("����ɾ����");
					}
				}
				wk.reset();
				
				flag=false;
			}
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
