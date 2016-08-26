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
		System.out.println(list.removeLast());//删除尾
		
		System.out.println(list.peek());//看要删除的头
		System.out.println(list.peekFirst());//看要删除的头
		System.out.println(list.peekLast());//看要删除的尾
		System.out.println(list.poll());////删除的头
		
		System.out.println(list.pollFirst());//删除的头
		System.out.println(list.pollLast());//删除的尾
		
		System.out.println(list.pop());//删除的是头
		
		
		
		
		System.out.println("----");
		Iterator it1=list.iterator();
		
		while(it1.hasNext()){
			System.out.println(it1.next());
		}
		
	}
}
