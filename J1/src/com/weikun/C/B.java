package com.weikun.C;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class B {
	public static void main(String[] args) {
//		Date d=new Date();
//		System.out.println(d);
//		
//		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss E D");
//		
//		sdf.setTimeZone(TimeZone.getTimeZone("GMT+8"));
//		
//		System.out.println(sdf.format(System.currentTimeMillis()));
//		System.out.println(System.currentTimeMillis());
//		
		Calendar c=Calendar.getInstance(TimeZone.getTimeZone("GMT+8"));
		
		System.out.println(c.get(Calendar.YEAR));
		System.out.println(c.get(Calendar.MONTH)+1);
		System.out.println(c.get(Calendar.DAY_OF_MONTH));
		
		c.add(Calendar.MONTH, -2);
		System.out.println(c.get(Calendar.MONTH));
		
	}
	
	
}
