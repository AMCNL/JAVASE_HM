package com.itheima.myString;
/*
		���󣺰������е����ݰ���ָ������ʽƴ�ӳ�һ���ַ���
		������
		��һ��:����һ��int���͵�����
		�ڶ���:д����ʵ�ְ������е�Ԫ�ذ���ָ���ĸ�ʽ		ƴ�ӳ�һ���ַ���
		������:���÷���
		���Ĳ�:������

 */

import java.util.Scanner;

public class StringTest4 {
	public static void main(String[] args) {
		int[] arr = {1,3,5,9,4};
		
		String result = printToString(arr);
		System.out.println(result);
		
		
	}
	
	public static String printToString(int[] arr){
		String s = "";
		s+="[";
		for (int i = 0; i < arr.length; i++) {
			if(i==arr.length-1){
				s += arr[i];
			}else{
				s+=arr[i];
				s+=", ";
			}
		}
		s+="]";
		
		return s;
	}
	
	

}
