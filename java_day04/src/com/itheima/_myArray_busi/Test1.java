package com.itheima._myArray_busi;
/*
 * 拓展：不死神兔50个月
 * 注意：类型要用long类型
 */
public class Test1 {

	public static void main(String[] args) {
		
		//定义一个long类型的数组，数组长度为50
		long[] arr = new long[50];
		
		//第一个月时兔子的对数
		arr[0] = 1;
		
		//第二个月的时候兔子的对数
		arr[1] = 1;
		
		for(int i=2;i<arr.length;i++){
			arr[i] = arr[i-1]+arr[i-2];
		}
		
		//得到50个月后的兔子对数
		long sum = arr[arr.length-1];
		
		//打印输出
		System.out.println(sum);

	}

}
