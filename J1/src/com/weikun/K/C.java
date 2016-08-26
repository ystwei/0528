package com.weikun.K;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Vector;

public class C {
	public static void main(String[] args) {
		List<String> list=new ArrayList<String>();//虚方法调用	
		
		
		list.add("A");
		list.add("B");
		list.add("C");
		list.add("D");
		
		Vector<String> v=new Vector<String>();
		
		v.add("1");
		v.add("2");
		v.add("3");
		v.add("4");
		
		
		Enumeration<String> e=v.elements();
		
		while(e.hasMoreElements()){
			System.out.println(e.nextElement());
		}
				
				
		
		//list.add(100);//int --->包装类Integer--->Object		
		
		
		Iterator<String> it=list.iterator();
		
		while(it.hasNext()){//如果有元素，那么返回为true，否则返回为false
			System.out.println(it.next());
		}
		System.out.println("-----------");
		for(String o :list){
			System.out.println(o);
			
		}
		System.out.println("-----------");
		
		for(int i=0;i<list.size();i++){
			System.out.println(list.get(i));
			
		}
		System.out.println("-----------");
		
		ListIterator<String> li=list.listIterator();		
		while(li.hasNext()){
			System.out.println(li.next());
		}		
		while(li.hasPrevious()){
			System.out.println(li.previous());
		}
		System.out.println("-----------");
		Object os[]=list.toArray();
		
		
		for(int i=0;i<os.length;i++){
			System.out.println(os[i]);
		}
	}
	
}
