package com.weikun.K;

import java.util.Iterator;
import java.util.LinkedList;

public class D {
	public static void main(String[] args) {
		LinkedList list=new LinkedList();
		
		
		list.add("A");
		
		list.addFirst("B");
		list.addLast("C");
		list.add("D");
		list.offer("E");
		list.offerFirst("F");
		list.offerLast("G");
		
		list.push("H");
		list.push("I");
		
		Iterator it=list.iterator();
		
		while(it.hasNext()){
			System.out.println(it.next());
		}
		
		System.out.println("----");
		System.out.println(list.removeLast());//ɾ��β
		
		System.out.println(list.peek());//��Ҫɾ����ͷ
		System.out.println(list.peekFirst());//��Ҫɾ����ͷ
		System.out.println(list.peekLast());//��Ҫɾ����β
		System.out.println(list.poll());////ɾ����ͷ
		
		System.out.println(list.pollFirst());//ɾ����ͷ
		System.out.println(list.pollLast());//ɾ����β
		
		System.out.println(list.pop());//ɾ������ͷ
		
		
		
		
		System.out.println("----");
		Iterator it1=list.iterator();
		
		while(it1.hasNext()){
			System.out.println(it1.next());
		}
		
	}
}
