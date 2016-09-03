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
		//1得到文件监听服务
		
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
				wk=ws.take();//执行监听，返回当前的监听key
				for(WatchEvent we   :wk.pollEvents()){
					if(we.kind()==StandardWatchEventKinds.ENTRY_CREATE){
						System.out.println("发生创建了");
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
				wk=ws.take();//执行监听，返回当前的监听key
				for(WatchEvent we   :wk.pollEvents()){
					if(we.kind()==StandardWatchEventKinds.ENTRY_DELETE){
						System.out.println("发生删除了");
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
