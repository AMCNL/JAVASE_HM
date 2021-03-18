package com.itheima.homework.high;

import java.util.Scanner;

/*
		 假设一个简单的在ATM的取款过程如下：首先提示用户输入密码（password），
		最多只能输入3次，超过3次则提示用户"密码错误，请取卡"交易结束。
		如果用户密码正确，再提示用户输入金额（amount），ATM只能输出100元的纸币，
		一次取钱数要求最低0元，最高1000元。
		如果用户输入的金额符合上述要求，则打印输出用户取的钱数，
		最后提示用户"交易完成，请取卡"，否则提示用户重新输入金额。
		假设用户密码是"111111"。
		
		打印格式：

		第一种情况：三次密码输入错误
		请输入密码：2
		密码错误，请重新输入：3
		密码错误，请重新输入：4
		密码错误，请取卡
		
		第二种情况：密码输入正确，可以取款
		请输入密码：2
		密码错误，请重新输入：111111
		请输入取款金额：3000
		您输入的取款金额有误，请重新输入：999
		请取走现金：999元
		交易完成，请取卡
 */
public class Test07 {
	public static void main(String[] args) {
		//创建键盘录入对象
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入密码：");
		
		//接收录入的密码
		int inputPwd = sc.nextInt();
		//取款密码
		int pwd = 123456;
		
		//定义取款次数
		int count = 2;
		
		while(inputPwd!=pwd){
			System.out.print("密码错误，请重新输入：");
			System.out.println();
			inputPwd = sc.nextInt();
			count --;
			if(count==0){
				System.out.println("密码错误，请取卡");
				return;
			}
		}
		
		System.out.print("请输入取款金额：");
		//定义金额变量
		int money = sc.nextInt();
		while(true){
			if(money<100 || money>1000 || money%100!=0){
				System.out.print("您输入的取款金额有误，请重新输入：");
				money = sc.nextInt();
			}else{
				System.out.println("请取走现金："+money);
				System.out.println("交易完成，请取卡!");
				break;
			}
		}
		
		
		
		
	}

}
