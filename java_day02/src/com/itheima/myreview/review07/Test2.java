package com.itheima.myreview.review07;

//1.导包
import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		
		//2.创建键盘录入对象
		Scanner sc = new Scanner(System.in);
		
		//提示
		System.out.print("输入第一个数：");
		//3.接收int类型的数据
		int num1 = sc.nextInt();
		
		//提示
		System.out.print("输入第二个数：");
		//接收int类型的数据
		int num2 = sc.nextInt();
		
		//计算
		int sum = num1 + num2;
		
		//将结果输出
		System.out.println("结果为:" + sum);
	}
	
}
