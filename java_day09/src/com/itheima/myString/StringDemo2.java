package com.itheima.myString;

/*
          需求：遍历字符串(获取字符串中的每一个字符)
	分析：
	第一步:定义一个字符串
	第二步:通过charAt(int index)方法,获取每一个字符
	第三步:通过循环遍历字符串(需要获取字符串的长度)

 */
public class StringDemo2 {
	public static void main(String[] args) {
		String s = "helloword";
		System.out.println("字符串长度为：" + s.length());
		for (int i = 0; i < s.length(); i++) {
			System.out.println(s.charAt(i));

		}
	}

}
