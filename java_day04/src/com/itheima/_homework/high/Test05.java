package com.itheima._homework.high;

import java.util.Arrays;
import java.util.Random;

/*
		定义长度为10的int数组,数组中的10个元素为随机生成的1-100的数字
		要求:打印数组中第二大的数和第二小的数字
		打印格式:
		原数组内容
		90 34 12 35 98 23 17 71 4 66 
		数组中的第二大的数字为:90
		数组中的第二小的数字为:12
		
		
		//拓展，使用冒泡排序解题
		 * //冒泡排序：1-首先用第一个值依次给后面的比较，如果该数比后面的数大，就交换值
		  //2-接着用交换后的值和后面的比较，直到最后得到最大值
		 //3-然后重复1操作，因为已经确定最后一位为最大值，所以最后一位不参与比较，顾每次比较的次数要去掉一次

 */
public class Test05 {

	public static void main(String[] args) {
		int[] arr = new int[10];

		Random rd = new Random();

		System.out.println("原数组内容为:");

		for (int i = 0; i < arr.length; i++) {
			arr[i] = rd.nextInt(100) + 1;

			System.out.print(arr[i] + " ");

		}
		System.out.println("---------------");
		int max = arr[0];
		int min = arr[0];

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];

			}

			if (arr[i] < min) {
				min = arr[i];
			}

		}

		System.out.println("max:" + max);
		System.out.println("min:" + min);
		System.out.println("------------------------------------");

		int smax = 0;
		int smin = 101;

		// 给数组进行排序(冒泡排序)
		for (int i = 0; i < arr.length; i++) {

			for (int j = 0; j < arr.length - 1 - i; j++) {
				// 冒泡排序：1-首先用第一个值依次给后面的比较，如果该数比后面的数大，就交换值
				// 2-接着用交换后的值和后面的比较，直到最后得到最大值
				// 3-然后重复1操作，因为已经确定最后一位为最大值，所以最后一位不参与比较，顾每次比较的次数要去掉一次

				if (arr[j] > arr[j + 1]) {
					// 首先定义个临时变量
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;

				}
			}
			
			//倒序输出
			System.out.print(arr[arr.length - 1 - i] + " ");
		}
		System.out.println();
		System.out.println("-----------------------");
		//排序后的数组遍历（正序）
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

		// System.out.println(arr[arr.length - 1]);
		
		System.out.println();
		System.out.println("--------------------");
		//第二大的值为
		System.out.println("第二大的值为"+arr[arr.length-1-1]);
		//第二小的值为
		System.out.println("第二小的值为"+arr[1]);

	}

}
