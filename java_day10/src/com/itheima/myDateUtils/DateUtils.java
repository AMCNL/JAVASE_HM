package com.itheima.myDateUtils;
/*
		需求:定义解析和格式化日期的工具类,并测试

 */
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtils {
 
	//构造函数私有化
	private DateUtils(){}
	
	
	/*
	 * 日期类型转字符串：
	 *  明确：
	 *     返回值类型：String
	 *     参数列表：Date date ，String format
	 */
	public static String dateToString(Date date,String format){
		
		SimpleDateFormat sdf = new SimpleDateFormat(format);
		
		String str = sdf.format(date);
		
		return str;
	}
	
	/*
	 * 字符串转日期：
	 *    明确：
	 *       返回值类型：Date
	 *       参数列表：String s，String format
	 * 
	 */
	
	public static Date stringToDate(String str,String format) throws ParseException{
		SimpleDateFormat sdf = new SimpleDateFormat(format);
		Date date = sdf.parse(str);
		
		return date;
		
	}

}
