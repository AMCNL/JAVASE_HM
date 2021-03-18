package com.itheima.myDateUtils;
/*
		����:��������͸�ʽ�����ڵĹ�����,������

 */
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtils {
 
	//���캯��˽�л�
	private DateUtils(){}
	
	
	/*
	 * ��������ת�ַ�����
	 *  ��ȷ��
	 *     ����ֵ���ͣ�String
	 *     �����б�Date date ��String format
	 */
	public static String dateToString(Date date,String format){
		
		SimpleDateFormat sdf = new SimpleDateFormat(format);
		
		String str = sdf.format(date);
		
		return str;
	}
	
	/*
	 * �ַ���ת���ڣ�
	 *    ��ȷ��
	 *       ����ֵ���ͣ�Date
	 *       �����б�String s��String format
	 * 
	 */
	
	public static Date stringToDate(String str,String format) throws ParseException{
		SimpleDateFormat sdf = new SimpleDateFormat(format);
		Date date = sdf.parse(str);
		
		return date;
		
	}

}
