package com.itheima.�ܽ�;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class String��Date��ת {

	public static void main(String[] args) throws ParseException {
		// Date-->String
		Date date = new Date();

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");

		String ss = sdf.format(date);

		System.out.println(ss);

		System.out.println("---------------------------------");
		// String-->Date

		String str = "2018-11-28";

		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd");//����ʱ���ʽ

		Date d = sdf1.parse(str);

		System.out.println(d);

		System.out.println("-----------------");
		
		/* ��չ
		 * ����һ��ʱ������������ʱ�����Ӧ��ʱ��
		 */
		
		
		Date ddd = new Date();
		
		long l = 1141100322949l;

		ddd.setTime(l);

		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");

		String sss = sdf.format(ddd);

		System.out.println(sss);

	}

}
