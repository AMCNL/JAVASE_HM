package com.itheima._homework.basic;
/*
 * 定义一个含有五个元素的数组,并为每个元素赋值,求数组中所有元素的最小值
	1.定义5个元素数组
	2.可以使用初始化数组的两种方式之一为数组元素赋值
	3.遍历数组求数组中的最小值
 */
public class Test01 {

	public static void main(String[] args) {
		//定义一个含有五个元素的数组
		int[] arr = new int[5];
		
		//为每个元素赋值
		arr[0] = -1;
		arr[1] = 2;
		arr[2] = 3;
		arr[3] = 4;
		arr[4] = 5;
		
		int min = arr[0];
		
		//遍历元素
		for (int i = 0; i < arr.length; i++) {
			
			if(arr[0]<min){
				min = arr[0];
			}
			
		}
		//打印最小值
		System.out.println("min:"+min);
		
		
		
		

	}

}
