package com.itheima.myswitch;
/*
 * switch:键盘录入1-7对应相应的星期几
 */
import java.util.Scanner;

public class SwitchTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("请输入要录入的数据（1-7）");

		int num = sc.nextInt();

		switch (num) {
		case 1:
			System.out.println("星期一");
			break;
		case 2:
			System.out.println("星期二");
			break;
		case 3:
			System.out.println("星期三");
			break;
		case 4:
			System.out.println("星期四");
			break;
		case 5:
			System.out.println("星期五");
			break;
		case 6:
			System.out.println("星期六");
			break;
		case 7:
			System.out.println("星期日");
			break;

		default:
			System.out.println("您输入的信息有误！！");

			break;
		}

	}

}
