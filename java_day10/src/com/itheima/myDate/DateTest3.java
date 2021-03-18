package com.itheima.myDate;
/*
		需要:格式化当前日期(格式:xxxx年xx月xx日 时:分:秒)
		分析:
		第一步:获取当前日期
		第二步:创建格式化日期对象
		第三步:对当前日期进行格式化
		第四步:打印

 */
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTest3 {

	public static void main(String[] args) throws ParseException {
		//	第一步:获取当前日期
		Date date = new Date();
		
		//第二步:创建格式化日期对象
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd HH:mm:ss");
		
		//第三步:对当前日期进行格式化
		String str = sdf.format(date);
		
		//打印
		System.out.println("----------------------------------------------");
		System.out.println("------------"+str+"--------------");
		System.out.println("----------------------------------------------");
		
		System.out.println("*************************************");
		
		String str1 = "2018/11/28 16:45:22";
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		Date dd = sdf1.parse(str1);
		
		System.out.println(dd);
		
		
		
		
		

	}

}
