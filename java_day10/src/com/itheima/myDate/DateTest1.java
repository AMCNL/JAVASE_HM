package com.itheima.myDate;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTest1 {

	public static void main(String[] args) throws ParseException {
		Date d = new Date();
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyÄêMMÔÂdd HH£ºmm£ºss");
		
		System.out.println(sdf.format(d));
		
		System.out.println("-------------------------------------");
		
		String dt= "2018-11-28 14:55:55";
		
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		
		Date date = sdf1.parse(dt);
		
		System.out.println(date);

	}

}
