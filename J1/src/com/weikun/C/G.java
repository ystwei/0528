package com.weikun.C;

import java.util.Arrays;

public class G {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int [] a={7,9,10,4,5,6};//一般数组
//		
//		Arrays.sort(a);
//		System.out.println(Arrays.binarySearch(a,4));
//		
//		for(int i  :a){
//			System.out.println(i);
//			
//		}
//		
		
		G0 [] g={//对象数组的排序
				new G0(50,"JACK"),
				new G0(200,"MIKE"),
				new G0(50,"ALICE")
				};
		
		Arrays.sort(g);
		System.out.println(Arrays.binarySearch(g, 	new G0(200,"MIKE")));
		for(G0 g0 :g){
			
			System.out.println(g0.getAge()+g0.getName());
		}
//		
	}

}
class G0 implements Comparable{
	private int age;
	private String name;
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public G0(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}
	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		//你比较其元素的算法
		G0 g1=(G0)o;
		return this.age-g1.age==0?this.name.compareTo(g1.name):this.age-g1.age;
	}
	
}