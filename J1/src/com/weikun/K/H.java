package com.weikun.K;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class H {
	public static void main(String[] args) {
		Map<String,Integer> map=new HashMap<String,Integer>();
		map.put("A", 100);
		map.put("B", 200);
		map.put("C", 300);
		map.put("D", 400);
		map.put("E", 500);
		Set <String> keys=map.keySet();		
		Iterator<String> it=keys.iterator();
		while(it.hasNext()){			
			String key=it.next();			
			System.out.println(key+"--->"+map.get(key));
			
		}		
		List<Map.Entry<String, Integer>> list=new ArrayList<Map.Entry<String, Integer>>(map.entrySet());
		Collections.sort(list, new Comparator<Map.Entry<String, Integer>>(){
			@Override
			public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {
				// TODO Auto-generated method stub
				return o1.getKey().compareTo(o2.getKey());
			}
		});
	
		for(Map.Entry<String, Integer>  m:list){
			
			System.out.println(m.getKey()+"--"+m.getValue());
		}
		
		
	}
}
