package com.itheima.myreview.review07;

import java.util.Scanner;

/*
 * 键盘输入操作的步骤：
 * 1.导包(手工输入,注意S在大写)
 *   import java.util.Scanner;
 * 2.创建键盘输入对象
 *   Scanner sc = new Scanner(System.in);
 * 3.获取一个整数
 *   int i = sc.nextInt();
 * 4.输出结果     
 *   System.out.println("i:" + i);
 *   
 * 注意：
 *   当程序执行到sc.nextInt()这句代码时，程序等待用户的输入 ，
 *   直到用户按了回车为止  
 */
public class Demo2 {
	public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       
       //提示用户输入一个整数：
       System.out.println("请输入一个整数：");
       
       //原来：int i = 10;
       int i = sc.nextInt();
       
       System.out.println("i:" + i);
	}
}
