package com.itheima.myReview;
/*
 * ƴ���ַ�����Ϊһ���ַ���(String ��ʽ)
 */
public class �ַ���ƴ��1 {
	public static void main(String[] args) {
		//����һ���ַ�����
		char[] ch = {'g','b','k'};
		String st = charToString(ch);
		System.out.println(st);
	}
	
	public static String charToString(char[] ch){
		String str= "";
		
		str += "[";
		for (int i = 0; i < ch.length; i++) {
			if(i == ch.length-1){
				str += ch[i];
			}else{
				str += ch[i];
				str += ", ";
			}
		}
		str += "]";
		return str;
	}

}
