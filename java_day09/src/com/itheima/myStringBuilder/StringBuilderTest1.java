package com.itheima.myStringBuilder;

public class StringBuilderTest1 {
	public static void main(String[] args) {
		
		StringBuilder sb = new StringBuilder();
		sb.append("hello");
		sb.append("world");
		
		System.out.println(sb);
		
		sb.reverse();
		
		System.out.println(sb);
	}

}
