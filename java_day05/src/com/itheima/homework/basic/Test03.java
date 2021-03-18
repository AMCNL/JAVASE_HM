package com.itheima.homework.basic;



/*
 * 主方法中给定数组int[] arr= {10,20,30,40,50,60};定义一个方法可以接受这个给定的数组
       并返回这个数组中元素的最小值
 */
public class Test03 {

	public static void main(String[] args) {

		// 给定数组
		int[] arr = { 10, 20, 30, 40, 50, 60 };

		// 调用求最小值函数
		int min = getMin(arr);
		System.out.println("min:" + min);
	}

	/*
	 * 返回数组中的最小值
	 */
	public static int getMin(int[] arr) {
		int min = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[0] < min) {
				min = arr[0];
			}
		}
		return min;
	}

}
