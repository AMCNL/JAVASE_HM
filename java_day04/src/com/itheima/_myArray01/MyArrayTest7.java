package com.itheima._myArray01;

import java.util.Scanner;
/*
		需求：评委打分案例:
		    键盘录入 6个分数，去掉一个最高分和最低分，得出最后平均分数。
 */
public class MyArrayTest7 {

	public static void main(String[] args) {
		//定义一个int类型，长度为6的数组
		int[] arr = new int[6];
		Scanner sc = new Scanner(System.in);
		int max = arr[0];
		int min = arr[0];
		//定义一个求和变量
		int sum=0;
		//定义一个平均值变量
		int avg=0;
		for(int i=0;i<arr.length;i++){
			System.out.print("请输入第个"+(i+1)+"分数:");
			arr[i] = sc.nextInt();
			
			//求出最高分
			if(arr[i]>max){
				max = arr[i];
			}
			//求出最高低分
			if(arr[i]<min){
				min = arr[i];
			}
			
			sum += arr[i];
			
		}
		
		avg = (sum-max-min)/(arr.length-2);
		System.out.println("去掉一个最低分，去掉一个最高分，评委平局分为："+avg);

	}

}
