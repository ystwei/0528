package com.weikun.nio;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;

public class C {
	public static void main(String[] args) {
		new C().readFile1();
	}
	public void writeFile(){
		Path file=Paths.get("c://2.txt");
		if(!file.toFile().exists()){//判断是否存在
			try {
				Files.createFile(file);//如果不存在就创建
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}	
		try (BufferedWriter bw=Files.newBufferedWriter(file, StandardCharsets.UTF_8, StandardOpenOption.WRITE)){
			
			bw.write("中华人民共和国");
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
	public void readFile1(){
		Path file=Paths.get("1.txt");
		
		try(BufferedReader br=Files.newBufferedReader(file, StandardCharsets.UTF_8)) {
			String line="";
			while((line=br.readLine())!=null){
				
				System.out.println(line);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public void readFile(){
		
		Path file=Paths.get("1.txt");
		try {
			List <String> list=Files.readAllLines(file, StandardCharsets.UTF_8);
			
//			for(String s :list){
//				System.out.println(s);
//				
//			}
			
			byte buffer[]=Files.readAllBytes(file);
			
			System.out.println(new String(buffer,"utf-8"));
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
