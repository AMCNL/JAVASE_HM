package com.itheima.myString;

/*
 *  String类创建对象特点：
 *     通过构造方法创建
 *     通过直接赋值方式创建
 *     
 *  两者的区别：
 *     通过构造方法创建字符串对象在堆内存
 *     通过直接赋值方式对象在方法区的常量池
 *     
 *  方法区常量池：方便字符串数据的复用，（如果数据相同直接拿引用地址使用）
 */
public class StringDemo {
	public static void main(String[] args) {
		String s1 = new String("hello");
		String s2 = new String("hello");
		
		String s3 = "hello";
		String s4 = "hello";
		
		
		System.out.println(s1==s2);
		System.out.println(s1==s3);
		System.out.println(s3==s4);
		
	}

}
