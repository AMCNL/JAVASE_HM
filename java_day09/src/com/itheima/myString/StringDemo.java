package com.itheima.myString;

/*
 *  String�ഴ�������ص㣺
 *     ͨ�����췽������
 *     ͨ��ֱ�Ӹ�ֵ��ʽ����
 *     
 *  ���ߵ�����
 *     ͨ�����췽�������ַ��������ڶ��ڴ�
 *     ͨ��ֱ�Ӹ�ֵ��ʽ�����ڷ������ĳ�����
 *     
 *  �����������أ������ַ������ݵĸ��ã������������ֱͬ�������õ�ַʹ�ã�
 */
public class StringDemo {
	public static void main(String[] args) {
		String s1 = new String("hello");
		String s2 = new String("hello");
		
		String s3 = "hello";
		String s4 = "hello";
		
		
		System.out.println(s1==s2);
		System.out.println(s1==s3);
		System.out.println(s3==s4);
		
	}

}
