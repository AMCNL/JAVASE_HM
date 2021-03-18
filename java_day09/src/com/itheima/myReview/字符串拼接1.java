package com.itheima.myReview;
/*
 * 拼接字符数组为一个字符串(String 方式)
 */
public class 字符串拼接1 {
	public static void main(String[] args) {
		//定义一个字符数组
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
