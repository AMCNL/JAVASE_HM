package com.itheima._for;
/*
 * 循环的求和运算
 */
public class MyForTest3 {

	public static void main(String[] args) {
		//1-n数据之和
		//定义一个sum变量用来存储计算的和，初始化值为0
		int sum=0;
		for (int i = 1; i <=100; i++) {
			//sum=sum+i;
		   sum +=i;
		}
		System.out.println(sum);

	}

}
