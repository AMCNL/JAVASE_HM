package com.itheima.myReview;
/*
 * 把一个字符串反转(String 方式)
 */
public class 字符串反转2 {
	public static void main(String[] args) {
		String str = "abcd";
		
		String st = charToString(str);
		
		
		System.out.println("反转后的值："+st);
		
	}
	
	public static String charToString(String str){
		String st = "";
		
		for (int i = str.length()-1; i >=0; i--) {
			
		    st+=str.charAt(i);
		    
		}
		
		return st;
	}

}
