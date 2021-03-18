package com.itheima.methodCompare;

import java.util.Scanner;

/*
 *   定义一个方法判断三个整数是否相等
要求：1.在注释中写明需求
          2.在注释中明确返回值类型是什么
          3.在注释中明确参数列表是什么

调用该方法返回结果，打印结果
要求：1.使用键盘录入两个int数做为参数，调用方	     法时传入
	   2.打印输出结果
 */
public class Test02 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("请输入第一个数：");
		int x = sc.nextInt();
		System.out.println("请输入第二个数：");
		int y = sc.nextInt();
		System.out.println("请输入第三个数：");
		int z = sc.nextInt();
		boolean flag = compare(x, y,z);
		System.out.println("flag:" + flag);

	}

	/*
	 * 返回值类型：boolean 参数列表：int a,int b
	 */
	public static boolean compare(int a, int b,int c) {
		if (a == b && b== c) {
			return true;
		} else {
			return false;
		}
        
		//三元
		// return a==b?true:false;
		
		//一句搞定
		// return a==b;
	}
}
