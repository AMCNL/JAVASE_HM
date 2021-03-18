package com.itheima.myString;
/*
		需求：把数组中的数据按照指定个格式拼接成一个字符串
		分析：
		第一步:定义一个int类型的数组
		第二步:写方法实现把数组中的元素按照指定的格式		拼接成一个字符串
		第三步:调用方法
		第四步:输出结果

 */

import java.util.Scanner;

public class StringTest4 {
	public static void main(String[] args) {
		int[] arr = {1,3,5,9,4};
		
		String result = printToString(arr);
		System.out.println(result);
		
		
	}
	
	public static String printToString(int[] arr){
		String s = "";
		s+="[";
		for (int i = 0; i < arr.length; i++) {
			if(i==arr.length-1){
				s += arr[i];
			}else{
				s+=arr[i];
				s+=", ";
			}
		}
		s+="]";
		
		return s;
	}
	
	

}
