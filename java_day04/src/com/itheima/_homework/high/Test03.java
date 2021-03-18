package com.itheima._homework.high;

import java.util.Scanner;

/*
			3．训练案例3
			3.1．训练考核知识点
			数组，循环，if
			3.2．训练描述
			从键盘上输入10个整数，合法值位1、2或3，
			不是这3个数则为非法数字。试编程统计每个整数和非法数字的个数。
			
			打印格式：
				请输入10个整数：
			1
			2
			3
			3
			2
			1
			3
			3
			5
			6
			数字1的个数：2
			数字2的个数：2
			数字3的个数：4
			非法数字的个数：2


*/
public class Test03 {

	public static void main(String[] args) {
		// 定义数组
		int[] arr = new int[10];

		// 创建键盘录入对象
		Scanner sc = new Scanner(System.in);

		// 定义计数变量
		int count1 = 0;

		// 定义计数变量
		int count2 = 0;

		// 定义计数变量
		int count3 = 0;

		// 定义计数变量
		int count4 = 0;

		for (int i = 0; i < arr.length; i++) {
			System.out.println("请输入第" + (i + 1) + "个整数：");
			arr[i] = sc.nextInt();

			if (arr[i] == 1) {
				count1++;
			} else if (arr[i] == 2) {
				count2++;
			} else if (arr[i] == 3) {
				count3++;
			} else {
				count4++;
			}
		}
		
		System.out.println("数字1的个数:"+count1);
		System.out.println("数字2的个数:"+count2);
		System.out.println("数字3的个数:"+count3);
		System.out.println("非法数字的个数:"+count4);

		

		
		

	}

}
