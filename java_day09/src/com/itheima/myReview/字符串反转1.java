package com.itheima.myReview;
/*
 * ��һ���ַ�����ת(StringBuilder ��ʽ)
 */
public class �ַ�����ת1 {
	public static void main(String[] args) {
		String str = "abcd";
		
		String st = reverse(str);
		
		
		System.out.println("��ת���ֵ��"+st);
		
	}
	
	public static String reverse(String str){
		
		StringBuilder sb = new StringBuilder(str);
		
		return sb.reverse().toString();
	}

}
