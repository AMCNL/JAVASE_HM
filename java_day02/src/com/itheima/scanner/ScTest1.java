package com.itheima.scanner;

import java.util.Scanner;

public class ScTest1 {
	public static void main(String[] args) {
		//创建输入对象
		Scanner sc = new Scanner(System.in);
		
		System.out.println("请输入第一个数：");
		int a = sc.nextInt();
		
		System.out.println("请输入第二个数：");
		int b = sc.nextInt();
		
		System.out.println("请输入第三个数：");
		int c = sc.nextInt();
		
		//先比较ab的值，获得的较大值赋值给临时变量temp
		int temp = (a > b) ? a : b;
		//判断temp的值和c比较，得到的较大值赋值给max
		int max = (temp>c) ? temp:c;
		
		//一步搞定
		int max1 = a>b?(a>c?a:c):(b>c?b:c);
		
		System.out.println("最大值为："+max);
		System.out.println("最大值为："+max1);
		
	}

}
