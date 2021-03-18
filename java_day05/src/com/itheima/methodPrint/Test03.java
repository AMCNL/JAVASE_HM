package com.itheima.methodPrint;

import java.util.Scanner;

/*
 * 需求： 定义数组int arr = {13,52,37,41,59,46,88}
		定义一个方法获取数组中的最大值
		定义一个方法获取数组中的最小值
		要求：
		1.确定方法的参数列表
		2.确定方法的返回值类型
		3.在main方法中打印最小值和最大值

 *  
 */
public class Test03 {
	public static void main(String[] args) {
		// 定义一个数组
		int[] arr = { 13, 52, 37, 41, 59, 46, 88 };

		// 调用最大值方法
		int max = getMax(arr);
		System.out.println("max:" + max);
		System.out.println("-----------------");
		// 调用最大值方法
		int min = getMin(arr);
		System.out.println("min:" + min);
		System.out.println("-----------------");
		// 调用求和方法
		int sum = getSum(arr);
		System.out.println("sum:" + sum);
		System.out.println("-----------------");
		// 调用平均值方法
		double avg = getAvg(arr);
		System.out.println("avg:" + avg);
		System.out.println("###############################");
		
		int[] rs = getMaxAndMin(arr);
		System.out.println("最大值为："+rs[0]+",最小值为："+rs[1]);
		

	}

	/*
	 * 定义一个方法获取数组中的最大值 返回值类型：int 参数列表：int[] arr
	 */
	public static int getMax(int[] arr) {
		int max = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		return max;
	}

	/*
	 * 定义一个方法获取数组中的最小值 返回值类型：int 参数列表：int[] arr
	 */
	public static int getMin(int[] arr) {
		int min = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] < min) {
				min = arr[i];
			}
		}
		return min;
	}

	/*
	 * 定义一个方法获取数组中的和 返回值类型：int 参数列表：int[] arr
	 */
	public static int getSum(int[] arr) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		return sum;
	}

	/*
	 * 定义一个方法获取数组中的平均值 返回值类型：int 参数列表：int[] arr
	 */
	public static double getAvg(int[] arr) {
		int sum = getSum(arr);
		double vag = (double) sum / arr.length;
		return vag;
	}
	
	/*
	 * 通过数组方法，返回最大值和最小值（练习拓展）
	 */
	public static int[] getMaxAndMin(int[] arr){
		int max = arr[0];
		int min = arr[0];
		
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] > max){
				max = arr[i];
			}
			
			if(arr[i]<min){
				min = arr[i];
			}
			
		}
		
		int[] rs = new int[2];
		rs[0] = max;
		rs[1] = min;
		
		return rs;
	}
}
