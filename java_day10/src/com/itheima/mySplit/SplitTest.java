package com.itheima.mySplit;

import java.util.Arrays;

public class SplitTest {

	public static void main(String[] args) {
		//第一步:定义一个字符串
		String s = "91 27 46 38 50";

		//第二步:将字符串进行切割(使用空格切割),返回一个字符串数组
		String[] ns = s.split(" ");
	
		
		/*
		 * 字符串排序可以用，但是从意义来讲不大（毕竟比较两个字符串没意义），
		 *一般是int类型数组排序，排序后可以进行比较两个数的大小
		 */
		
		
		//第三步:将字符串数组转换为int类型的数组
		int[] arr = new int[ns.length];

		for (int i = 0; i < ns.length; i++) {
			
			arr[i] = Integer.parseInt(ns[i]);
		}
		
		//第四步:对转换后int类型的数组进行排序
		Arrays.sort(arr);
		
		
		//第五步:对数组进行拼接
		StringBuilder sb = new StringBuilder();
		
		for (int i = 0; i < arr.length; i++) {
			if(i == arr.length){
				sb.append(arr[i]);
			}else{
				sb.append(arr[i]).append(" ");
			}
			
		}
		
		String rs  = sb.toString();
		
		System.out.println(rs);
		

	}

}
