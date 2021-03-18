package com.itheima._myArray_pingwei;

import java.util.Scanner;

/*
 * 评委打分案例的:
 * 
    
 */
public class MyTest1 {

	public static void main(String[] args) {
		// 定义一个int数组，数组长度为6
		int[] arr = new int[6];

		// 创建键盘录入对象
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < arr.length; i++) {
			System.out.print("请为第" + (i + 1) + "位选手打分：");

			// 为数组每个元素赋值
			arr[i] = sc.nextInt();
		}

		int min = arr[0];
		int max = arr[0];
		int sum = 0;

		// 循环
		for (int i = 0; i < arr.length; i++) {

			// 解决最大值
			if (arr[i] > max) {
				max = arr[i];
			}

			// 解决最小值
			if (arr[i] < min) {
				min = arr[i];
			}

			sum += arr[i];
		}
		// 平均值
		double avg = (double) (sum - max - min) / (arr.length - 2);

		System.out.println("选手的最终得分为：" + avg);
	}

}
