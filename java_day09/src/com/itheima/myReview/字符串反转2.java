package com.itheima.myReview;
/*
 * ��һ���ַ�����ת(String ��ʽ)
 */
public class �ַ�����ת2 {
	public static void main(String[] args) {
		String str = "abcd";
		
		String st = charToString(str);
		
		
		System.out.println("��ת���ֵ��"+st);
		
	}
	
	public static String charToString(String str){
		String st = "";
		
		for (int i = str.length()-1; i >=0; i--) {
			
		    st+=str.charAt(i);
		    
		}
		
		return st;
	}

}
