package com.weikun.K;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Properties;
import java.util.Set;

public class G {
	public static void main(String[] args) {
		Properties pro=new Properties();
		
		try {
			pro.load(new FileInputStream(new File("src/suffix.txt")));
			
			Set <Entry<Object,Object>> s=pro.entrySet();
			
			Iterator<Entry<Object,Object>> it=s.iterator();
			
			while(it.hasNext()){
				Entry<Object ,Object> e=it.next();
				
				System.out.println(e.getKey()+"--"+e.getValue());
			}
			
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
