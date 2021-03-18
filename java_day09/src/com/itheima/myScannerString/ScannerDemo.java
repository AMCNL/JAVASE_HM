package com.itheima.myScannerString;

import java.util.Scanner;

public class ScannerDemo {
	public static void main(String[] args) {
		//创建键盘录入对象
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一段话：");
		/*
		 * 接收字符串类型的数据
		 *       nextLine() ->表示用字符串类型接收键盘录入
		 */
		String str = sc.nextLine();
		
		System.out.println("str:"+str);
	}

}
