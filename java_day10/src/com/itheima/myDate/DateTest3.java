package com.itheima.myDate;
/*
		��Ҫ:��ʽ����ǰ����(��ʽ:xxxx��xx��xx�� ʱ:��:��)
		����:
		��һ��:��ȡ��ǰ����
		�ڶ���:������ʽ�����ڶ���
		������:�Ե�ǰ���ڽ��и�ʽ��
		���Ĳ�:��ӡ

 */
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTest3 {

	public static void main(String[] args) throws ParseException {
		//	��һ��:��ȡ��ǰ����
		Date date = new Date();
		
		//�ڶ���:������ʽ�����ڶ���
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy��MM��dd HH:mm:ss");
		
		//������:�Ե�ǰ���ڽ��и�ʽ��
		String str = sdf.format(date);
		
		//��ӡ
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
