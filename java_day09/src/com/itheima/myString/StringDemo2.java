package com.itheima.myString;

/*
          ���󣺱����ַ���(��ȡ�ַ����е�ÿһ���ַ�)
	������
	��һ��:����һ���ַ���
	�ڶ���:ͨ��charAt(int index)����,��ȡÿһ���ַ�
	������:ͨ��ѭ�������ַ���(��Ҫ��ȡ�ַ����ĳ���)

 */
public class StringDemo2 {
	public static void main(String[] args) {
		String s = "helloword";
		System.out.println("�ַ�������Ϊ��" + s.length());
		for (int i = 0; i < s.length(); i++) {
			System.out.println(s.charAt(i));

		}
	}

}
