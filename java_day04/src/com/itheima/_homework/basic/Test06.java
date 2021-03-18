package com.itheima._homework.basic;

/*
		有一对兔子，从出生后第3个月起每个月都生一对兔子，
		小兔子长到第三个月后每个月又生一对兔子，
		假如兔子都不死，问第二十个月的兔子对数为多少？
		
		第一个月：1
		第二个月：1
		第三个月：2
		第四个月：3
		第五个月：5
		...
				
		从第三个月开始，每个月的兔子对数是前两个月的兔子对数之和
	
		第一个月和第二个月的兔子对数都是1
		
		
		思路：
		A:由于数据比较多，所以我们定义数组实现	
		int[] arr = new int[20];
		B:给数组中的元素赋值
		arr[0] = 1;
		arr[1] = 1;
		C:从第三个月开始，根据规律赋值
		arr[2] = arr[1] + arr[0];
		arr[3] = arr[2] + arr[1];
		arr[4] = arr[3] + arr[2];
		...
		D:输出第二十个月的兔子对数，其实就是输出arr[19]
 */
public class Test06 {

	public static void main(String[] args) {
        //定义数组
		int[] arr = new int[20];
		
		//数组元素下标为0的值
		arr[0] = 1;
		
		//数组元素下标为1的值
		arr[1] = 1;
		
		//根据规律，循环从下标2开始给数组元素赋值
		for(int i=2;i<arr.length;i++){
			arr[i] = arr[i-1]+arr[i-2];
		}
		
		//打印输出
		System.out.println(arr.length+"个月后，兔子的对数为："+arr[arr.length-1]+"对！");
	}

}
