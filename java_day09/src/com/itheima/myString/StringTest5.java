package com.itheima.myString;
/*
		×Ö·û´®µ¹ĞòÊä³öÊı

 */

import java.util.Scanner;

public class StringTest5 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("ÇëÊäÈëÒ»¸ö×Ö·û´®:");
		String str = sc.nextLine();
		
		String rs = reverse(str);
		
		
		System.out.println(rs);
		
		
	}
	
	public static String reverse(String str){
		String s = "";
		for (int i = str.length()-1; i >=0; i--) {
			s+=str.charAt(i);
		}
		
		
		return s;
	}
	

}
