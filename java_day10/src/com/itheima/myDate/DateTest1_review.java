package com.itheima.myDate;

import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTest1_review {

	public static void main(String[] args) throws ParseException {
		Date d = new Date();
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd HH：mm：ss");
		
		System.out.println(sdf.format(d));
		
		System.out.println("-------------------------------------");
		
		String dt= "2018-11-28 14:55:55";
		
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		
		Date date = sdf1.parse(dt);
		
		System.out.println(date);
		
		System.out.println("----------------------------------------");
		
		//获取当前时间戳
		System.out.println(d.getTime());
		
		long l = 1000*60*60;
		
		d.setTime(l);
		
		System.out.println(d.getTime());
		
		System.out.println("---------------------------");
		
		Timestamp t =  new Timestamp(1543390362068l);
		
		System.out.println(t);

	}

}
