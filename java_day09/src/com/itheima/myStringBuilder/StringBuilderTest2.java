package com.itheima.myStringBuilder;

import java.util.Scanner;

/*
	����:���ַ�����ת
	����:
	��һ��:����¼��һ���ַ�������
	�ڶ���:д����ʵ���ַ������ݵķ�ת
	������:���÷���
	���Ĳ�:������

 */
public class StringBuilderTest2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("������һ���ַ�����");
		String str = sc.nextLine();
		
		String rs=reverse(str);
		
		System.out.println(rs);
		
		
	}
	
	public static String reverse(String str){
		StringBuilder sb = new StringBuilder(str);
		
		sb.reverse();
		
		return sb.toString();
	}

}
