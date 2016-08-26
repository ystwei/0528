package com.weikun.K;

import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class E {
	public static void main(String[] args) {
		Hashtable<String,Integer> t=new Hashtable<String,Integer> ();
		
		
		t.put("A", 100);
		t.put("B", 200);
		t.put("C", 300);
		t.put("D", 400);
		
		Enumeration<String> es=t.keys();
		
		
		while(es.hasMoreElements()){
			String key=es.nextElement();
			System.out.println(key+"---"+t.get(key));
		}
		
		HashMap<String,Integer> map=new HashMap<String,Integer> ();
		
		map.put("A", 100);
		map.put("B", 200);
		map.put("C", 300);
		map.put("D", 400);
		map.put(null, null);
		
		Collection <Integer> cs=map.values();
		
		Iterator<Integer> it =cs.iterator();
		
		while(it.hasNext()){
			
			System.out.println(it.next());
		}
		System.out.println("----------");
		Set <String> keys=map.keySet();
		
		Iterator<String> it1=keys.iterator();
		while(it1.hasNext()){
			String s=it1.next();
			System.out.println(s+"---"+map.get(s));
		}
		System.out.println("----------");
		
		
		
		Set <Entry<String,Integer>>ss=map.entrySet();
		
		Iterator<Entry<String,Integer>> it2=ss.iterator();
		
		while(it2.hasNext()){
			Entry <String,Integer> e=it2.next();
			
			System.out.println(e.getKey()+"--"+e.getValue());
		}
		
		
	}
}
