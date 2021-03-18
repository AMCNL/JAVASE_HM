package com.itheima.guess;

import java.util.Random;
import java.util.Scanner;

/*
 * 猜数字小游戏
 */
public class GuessNumber {
	public static void main(String[] args) {
		//系统生成一个随机数
		Random random = new Random();
		//设置随机生成数范围为1-100
		int number = random.nextInt(100)+1;
		System.out.println("---------------欢迎来到猜数字小游戏 V1.0------------");
		//设置键盘录入数
		while(true){
			Scanner sc = new Scanner(System.in);
			System.out.println("请输入您要猜的数字（1-100）");
			int guessNumber = sc.nextInt();
			
			//判断
			//加循环
		
			if(guessNumber>number){
				System.out.println("您猜的数字"+guessNumber+"大了！请您再次输入...");
			}else if(guessNumber<number){
				System.out.println("您猜的数字"+guessNumber+"小了！请您再次输入...");
			}else{
				System.out.println("恭喜您，您猜对了！猜中数字为："+guessNumber);
				break;
			}
			
		}
	
		
		
		
	}

}
