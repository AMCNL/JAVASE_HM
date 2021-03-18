package com.itheima.myStringBuilder;

import java.util.Scanner;

/*
	需求:把字符串反转
	分析:
	第一步:键盘录入一个字符串数据
	第二步:写方法实现字符串数据的反转
	第三步:调用方法
	第四步:输出结果

 */
public class StringBuilderTest2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个字符串：");
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
