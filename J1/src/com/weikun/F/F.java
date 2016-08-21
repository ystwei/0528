package com.weikun.F;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;

public class F {//ByteArrayInputStream  ByteArrayOutputStream:把变量放到流里进行数据传输
	public static void main(String[] args) {
		
		int a=10;
		int j=100;
		int k=89;
		
		ByteArrayOutputStream bos=new ByteArrayOutputStream();
		
		bos.write(a);
		bos.write(j);
		bos.write(k);
		
		byte [] buffer=bos.toByteArray();
		
		for(int i=0;i<buffer.length;i++){
			
			System.out.println(buffer[i]);
			
		}
		
		ByteArrayInputStream bis=new ByteArrayInputStream(buffer);
		int n=-1;
		while( (n=bis.read())!=-1){
			
			System.out.println(n);
		}
		
		
	}

}
