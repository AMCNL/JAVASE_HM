package com.itheima.myDateUtils;

import java.text.ParseException;
import java.util.Date;

public class UtilsTest {

	public static void main(String[] args) throws ParseException {

		Date d = new Date();
		/*
		 * Date类型转String类型
		 */
		String str = DateUtils.dateToString(d, "yyyy/MM/dd HH:mm:ss");

		System.out.println(str);

		String str2 = DateUtils.dateToString(d, "yyyy-MM-dd HH:mm:ss");

		System.out.println(str2);

		System.out.println("-----------------------------------");
		
		/*
		 * +0
		 */

		String str3 = "2018-11-28 17:13:08";

		Date dd = DateUtils.stringToDate(str3, "yyyy-MM-dd HH:mm:ss");

		System.out.println(dd);

	}

}
