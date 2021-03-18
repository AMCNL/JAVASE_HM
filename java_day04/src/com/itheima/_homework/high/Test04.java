package com.itheima._homework.high;

import java.util.Scanner;

/*
		假设有一个长度为5的数组，数组元素通过键盘录入，如下所示：
		int[] arr = {1,3,-1,5,-2}
		要求：
		创建一个新数组newArr[],新数组中元素的存放顺序与原数组中的元素逆序，
		并且如果原数组中的元素值小于0，
		在新数组中按0存储。最后输出原数组和新数组中的内容
			
			
		打印格式：
		请输入5个整数：
		1
		3
		-1
		5
		-2
		原数组内容：
		1 3 -1 5 -2 
		新数组内容：
		0 5 0 3 1
 */
public class Test04 {

	public static void main(String[] args) {
		//定义一个对象
		int[] arr = {1,3,-1,5,-2};
		
		//定义新的数组
		int[] newArr = new int[5];
		
		//创建录入对象
		Scanner sc = new Scanner(System.in);
		
		System.out.println("请输入5个数：");
		for (int i = 0; i < arr.length; i++) {
			
			arr[i] = sc.nextInt();
			System.out.println();
			
		}
		System.out.println("原数组内容：");
		
		//循环遍历数组
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		System.out.println("新数组内容：");
		
	    for (int i = 0; i < newArr.length; i++) {
			
			if(arr[arr.length-1-i]<0){
				arr[arr.length-1-i] = 0;
				
			}
			
			//执行赋值操作，把一个数组的值逆序赋值给另一个数组
			newArr[i] = arr[arr.length-1-i];
			
			System.out.print(newArr[i]+" ");
		}
		
		

	}

}
