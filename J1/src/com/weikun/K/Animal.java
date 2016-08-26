package com.weikun.K;

public class Animal<T,R> {
	
	private T age;
	private R name;
	public T getAge() {
		return age;
	}
	public void setAge(T age) {
		this.age = age;
	}
	public R getName() {
		return name;
	}
	public void setName(R name) {
		this.name = name;
	}
	
	
}
