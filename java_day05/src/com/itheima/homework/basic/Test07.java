package com.itheima.homework.basic;

/*
 * 定义一个方法,实现同时求出两个整数的加、减、乘、除的结果,
       同时把这个四个结果返回(把四个数放入到一个数组中并返回)
 */
public class Test07 {

	public static void main(String[] args) {

		int[] arr = result(10, 5);
		System.out.println("两数的和为："+arr[0]);
		System.out.println("两数的差为："+arr[1]);
		System.out.println("两数的乘为："+arr[2]);
		System.out.println("两数的商为："+arr[3]);
	}
	
	/*
	 * 定义一个方法,实现同时求出两个整数的加、减、乘、除的结果,
	 * 同时把这个四个结果返回(把四个数放入到一个数组中并返回)
	 * 返回值类型：int[] arr
	 * 参数列表： int a，int b
	 */
	
	public static int[] result(int a,int b){
		int[] arr = new int[4];
		
		arr[0] = a+b;
		arr[1] = a-b;
		arr[2] = a*b;
		arr[3] = a/b;
		
		return arr;
	}

}
