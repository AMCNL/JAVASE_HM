package com.itheima._homework.basic;

import java.util.Random;

/*
 * 定义一个长度为3的一维数组,给每个元素赋值. 
 * (要求数组中每个元素的值是0-9的随机数)
 * 遍历数组打印每个元素的值
 * 
	1.定义长度为3的数组
	2.创建Random引用数据类型的变量
	3.生成3个0-9的随机数,为每一个元素赋值(可以用循环,也可以不使用循环)
	4.遍历数组，并打印每一个元素
 */
public class Test02 {

	public static void main(String[] args) {
		
		int[] arr = new int[3];
		
		Random rd = new Random();
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = rd.nextInt(9);
			System.out.println("arr["+i+"]"+arr[i]);
		}
		
		System.out.println("-----------自己写---------");
		
		
		/*
		int[] arr = new int[3];
		//创建随机数对象
		Random rd = new Random();
		
		//循环
		for (int i = 0; i < arr.length; i++) {
			
			//为元素赋值
			arr[i] = rd.nextInt(10);
			
			//打印输出
			System.out.println("arr["+i+"]:"+arr[i]);
		}
		*/
		
  
	}

}
