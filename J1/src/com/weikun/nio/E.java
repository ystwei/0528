package com.weikun.nio;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class E {
	public static void main(String[] args) {
		new E().readFile();
	}
	public void readFile(){
		Path path=Paths.get("c://3.txt");		
		ByteBuffer bb=ByteBuffer.allocate(1024*1024);		
		try(FileChannel fc=FileChannel.open(path, StandardOpenOption.READ);) {
			fc.read(bb);
			bb.flip();//让指针回到开始位置，方便在控制台进行读			
			Charset c=Charset.forName("utf-8");
			System.out.println(c.decode(bb));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}//append
	}
	public void write1File(){

		Path path=Paths.get("c://3.txt");
		
		if(!path.toFile().exists()){
			try {
				Files.createFile(path);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		try(FileChannel fc=FileChannel.open(path, StandardOpenOption.APPEND);) {
			
			
			fc.write(ByteBuffer.wrap("你好中国".getBytes()));
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}//append
	}
	public void writeFile(){
		
		Path path=Paths.get("c://3.txt");
		
		if(!path.toFile().exists()){
			try {
				Files.createFile(path);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		try(FileChannel fc=FileChannel.open(path, StandardOpenOption.WRITE);) {
			Charset c=Charset.forName("utf-8");
			
			fc.write(c.encode("你哈而不"));
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}//append
		
	}
}
