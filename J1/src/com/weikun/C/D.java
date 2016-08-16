package com.weikun.C;

import java.math.BigDecimal;
import java.util.Random;

public class D {
	public static void main(String[] args) {
//		System.out.println(Math.abs(-9.1));
//		System.out.println(Math.ceil(31.0/10));//比a大的最小的double值
//		System.out.println(Math.floor(7.1));//比a小的的最大的double值
//		System.out.println(Math.pow(2.1, -3.11));
		
//		for(int i=0;i<10;i++){//A--Z
//			
//			System.out.println((char)(Math.random()*26+65));//0<=  <1.0  0<=   <26 65<=   <91
//		}
		
		//System.out.println(Math.round(3.6222));
//		BigDecimal b=new BigDecimal(7.72251d);
//		System.out.println(b.setScale(8, BigDecimal.ROUND_HALF_UP));
		
		//System.out.println(Math.sqrt(4));
		
		Random r=new Random();
//		for(int i=0;i<20;i++){
//			System.out.println((char)(r.nextDouble()*26+65));//[A,Z]
//		}
		//r.setSeed(3L);
		for(int i=0;i<5;i++){
			
			System.out.println((char)(r.nextInt(10000)+20000));//[0,1.0)--->[0,10000)
		}
		
		
	}
}
