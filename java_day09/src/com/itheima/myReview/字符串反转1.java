package com.itheima.myReview;
/*
 * 把一个字符串反转(StringBuilder 方式)
 */
public class 字符串反转1 {
	public static void main(String[] args) {
		String str = "abcd";
		
		String st = reverse(str);
		
		
		System.out.println("反转后的值："+st);
		
	}
	
	public static String reverse(String str){
		
		StringBuilder sb = new StringBuilder(str);
		
		return sb.reverse().toString();
	}

}
