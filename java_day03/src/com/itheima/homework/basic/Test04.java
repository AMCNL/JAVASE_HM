package com.itheima.homework.basic;

import java.util.Scanner;

/*
 * 请按如下要求编写程序,打印菜单:
		1.从键盘上录入一个1到5的数字;
		2.当数字为1时打印菜单"新建";
		  当数字为2时打印菜单"打开文件";
		  当数字为3时打印菜单"保存";
		  当数字为4时打印菜单"刷新";
		  当数字为5时打印菜单"退出",并退出程序;
		  此行代码可以终止java程序运行: System.exit(0);
 */
public class Test04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个数（1-5）");
		int num = sc.nextInt();
		
		switch (num) {
		case 1:
			System.out.println("新建");
			break;
		case 2:
			System.out.println("打开文件");
			break;
		case 3:
			System.out.println("保存");
			break;
		case 4:
			System.out.println("刷新");
			break;
		case 5:
			System.out.println("退出");
			System.exit(0);
			break;

		default:
			break;
		}
		
		
		
	}

}
