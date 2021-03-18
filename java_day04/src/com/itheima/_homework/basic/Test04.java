package com.itheima._homework.basic;

import java.util.Random;
import java.util.Scanner;

/*
 * 键盘录入一个整数，创建一个该长度的数组，
 * 为每一个元素赋值为1-10的随机整数，最后打印数组中所有值大于5且为偶数的元素.
 * 
 * 思路：
		1键盘录入一个整数
		2定义长度为该整数的数组
		3创建Random引用数据类型的变量
		4生成5个0-9的随机数,为每一个元素赋值(建议用循环)
		5 遍历数组,输出满足条件的元素
 *    
 */
public class Test04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个数：");
		int num = sc.nextInt();

		// 创建一个int类型的数组，数组长度为num
		int[] arr = new int[num];

		// 创建录入对象
		Random rd = new Random();
        
		int count=0;
		//遍历数组元素
		for (int i = 0; i < arr.length; i++) {
			//为元素赋值
			arr[i] = rd.nextInt(10) + 1;

			//条件判断
			if (arr[i] > 5 && arr[i] % 2 == 0) {
				count++;
				//打印输出
				System.out.println("符合条件的数组元素有："+arr[i]);
			}
			
			if(count==0){
				System.out.println("没有符合条件的值");
			}
		}

	}

}
