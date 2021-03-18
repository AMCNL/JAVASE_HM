package com.itheima.总结;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class String和Date互转 {

	public static void main(String[] args) throws ParseException {
		// Date-->String
		Date date = new Date();

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");

		String ss = sdf.format(date);

		System.out.println(ss);

		System.out.println("---------------------------------");
		// String-->Date

		String str = "2018-11-28";

		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd");//设置时间格式

		Date d = sdf1.parse(str);

		System.out.println(d);

		System.out.println("-----------------");
		
		/* 拓展
		 * 给出一个时间戳，或者这个时间戳对应的时间
		 */
		
		
		Date ddd = new Date();
		
		long l = 1141100322949l;

		ddd.setTime(l);

		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");

		String sss = sdf.format(ddd);

		System.out.println(sss);

	}

}
