package com.itheima.myDate;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTest2 {

	public static void main(String[] args) throws ParseException {
		Date d1 = new Date();
		long begin = d1.getTime();
		
		String s = "";
		/*for (int i = 0; i < 50000; i++) {
			s += "hell0";
		}*/
		
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < 50000; i++){
			sb.append("hello");
		}
		
		Date d2 = new Date();

		long end = d2.getTime();
		
		System.out.println(end-begin+"ºÁÃë");

	}

}
