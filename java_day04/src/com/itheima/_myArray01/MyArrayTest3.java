package com.itheima._myArray01;

/*
 * 把一个数组的地址值赋值给另一个数组，操作另一个数组
 */
public class MyArrayTest3 {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5 };
		// 创建两个int类型的数组
		int[] arr1 = arr;
		int[] arr2 = arr;
		// 用1赋值
		arr1[0] = 11;
		arr1[1] = 22;
		arr1[2] = 33;
		arr1[3] = 44;
		arr1[4] = 55;
		// 遍历打印数组
		for (int i = 0; i < arr2.length; i++) {
			System.out.println("arr2[" + i + "]:" + arr2[i]);
		}

	}

}
