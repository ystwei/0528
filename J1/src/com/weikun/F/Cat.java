package com.weikun.F;

import java.io.Serializable;

public class Cat implements Serializable {
	public Cat(int old, String name) {
		super();
		this.old = old;
		this.name = name;
	}
	private int old;
	private String name;
	public int getOld() {
		return old;
	}
	public void setOld(int old) {
		this.old = old;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
