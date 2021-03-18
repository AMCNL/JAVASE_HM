package com.itheima.mySplit;

import java.util.Arrays;

public class SplitTest2 {

	public static void main(String[] args) {
		String s = "91 27 46 38 50";
		
		String[] ns = s.split(" ");
		
		//字符串排序可以用，但是从意义来讲不大（毕竟比较两个字符串没意义），
		//一般是int类型数组排序，排序后可以进行比较两个数的大小
		Arrays.sort(ns);
		
		
		
		StringBuilder sb = new StringBuilder();
		
		for (int i = 0; i < ns.length; i++) {
			if(i == ns.length){
				sb.append(ns[i]);
			}else{
				sb.append(ns[i]).append(" ");
			}
			
		}
		
		String rs  = sb.toString();
		
		System.out.println(rs);
		

	}

}
