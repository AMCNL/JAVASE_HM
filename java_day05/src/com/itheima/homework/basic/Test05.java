package com.itheima.homework.basic;



/*
 * 定义一个方法,求出给定的数字在给定int型数组中出现的次数,如果一次没有出现则返回0。
        如:给定数字3 求出3在数组 int[] arr = {3,4,3,5,7,9};中出现的次数 
 */
public class Test05 {

	public static void main(String[] args) {
		// 定义数组
		int[] arr = { 3, 4, 3, 5, 7, 9 };

		int num = 3;
		// 调用方法传递参数
		int count = count(arr, num);

		// 打印输出
		System.out.println(num + "出现的次数共：" + count + "次！");

	}

	/*
	 * 定义一个方法,求出给定的数字在给定int型数组中出现的次数,
	 * 如果一次没有出现则返回0。 返回值类型：int 参数列表：int[] arr,int
	 * num
	 */

	public static int count(int[] arr, int num) {
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == num) {
				count++;
			}
		}
		return count;
	}
}
