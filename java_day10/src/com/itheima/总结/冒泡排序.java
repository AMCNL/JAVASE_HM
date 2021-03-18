package com.itheima.总结;

/*
 * 相邻元素相互比较
 */
public class 冒泡排序 {

	public static void main(String[] args) {
		// 核心代码
		int[] arr = { 7, 4, 1, 8, 5, 2 };

		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr.length - 1 - i; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[i];
					arr[i] = arr[i + 1];
					arr[i + 1] = temp;
				}
			}
		}

	}

}
