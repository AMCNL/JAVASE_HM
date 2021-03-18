package com.itheima.homework.basic;

import java.util.Random;

/*
 * 随机产生两个整数,随机数的范围均是[1,100],定义方法求这两个整数的和并打印和值
 */
public class Test02 {

	public static void main(String[] args) {
		//创建随机对象
		Random rd = new Random();
		
		//赋值随机数给a
		int a = rd.nextInt(100)+1;
		
		//赋值随机数给b
		int b = rd.nextInt(100)+1;
		
		//调用方法传递值
		int sum=sum(a,b);
		
		//求和打印
		System.out.println("sum:"+sum);

	}
	
	/*
	 * 定义方法求这两个整数的和并打印和值
	 * 返回值类型：int
	 * 参数列表：int a，int b
	 */
	public static int sum(int a,int b){
		
		return a+b;
		
	}

}
