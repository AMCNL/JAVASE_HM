package com.itheima.myReview;
/*
 * 拼接字符数组为一个字符串(StringBuiler 方式)
 */
public class 字符串拼接2 {
	public static void main(String[] args) {
		//定义一个字符数组
		char[] ch = {'g','b','k'};
		String st = reverse(ch);
		System.out.println(st);
	}
	
	public static String reverse(char[] ch){
		StringBuilder sb = new StringBuilder();
		
		sb.append("[");
		for (int i = 0; i < ch.length; i++) {
			if(i==ch.length-1){
				sb.append(ch[i]);
			}else{
				sb.append(ch[i]).append(", ");
			}
		}
		sb.append("]");
		
		return sb.toString();
	}

}
