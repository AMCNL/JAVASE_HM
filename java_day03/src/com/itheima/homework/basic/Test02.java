package com.itheima.homework.basic;
/*
 * 求出1到100之间的既是3的倍数又是5倍数的数字之和.
	1.定义一个变量,记录累加求和
	2.循环遍历1到100之间的每个数字
	3.再循环中判断该数是否为既是3的倍数又是5倍数
	4.如果满足条件对该数进行累加求和
	6.循环结束后打印求和的变量
 */
public class Test02 {

	public static void main(String[] args) {
		int sum=0;
		for(int i=1;i<=100;i++){
			if(i%3==0 && i%5==0){
				sum+=i;
			}
		}
		System.out.println("1到100之间的既是3的倍数又是5倍数的数字之和是："+sum);

	}

}
