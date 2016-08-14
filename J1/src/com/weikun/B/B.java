package com.weikun.B;

import java.io.FileNotFoundException;

public class B {
	public void test() throws FileNotFoundException{
		
	}
	
	public static void main(String[] args) {
		try {
			new B().test();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
