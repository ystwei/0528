package com.weikun.K;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class F {
	public static void main(String[] args) {
		Set <String>s=new HashSet<String>();
		s.add("A");
		s.add("B");
		s.add("C");
		s.add("D");
		s.add("E");
		s.add(null);
		Iterator<String> it=s.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
		Object[] os=s.toArray();
		for(Object o :os){
			System.out.println(o);
			
		}
		
	}
}
