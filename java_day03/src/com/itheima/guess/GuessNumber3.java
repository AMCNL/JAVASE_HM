package com.itheima.guess;

import java.util.Random;
import java.util.Scanner;

/*
 * 猜数字小游戏，V3.0添加用户版
 */
public class GuessNumber3 {
	public static void main(String[] args) {
		//系统生成一个随机数
		Scanner scname = new Scanner(System.in);
		System.out.println("请输入您的姓名：");
		String name = scname.nextLine();
		
		Random random = new Random();
		//设置随机生成数范围为1-100
		int number = random.nextInt(10)+1;
		int count=8;
		int scount=0;
		System.out.println("--欢迎您--"+name+"--来到猜数字小游戏  版本V3.0用户+生命限制+反馈版------------");
		//设置键盘录入数
		
		while(true){
			Scanner sc = new Scanner(System.in);
			System.out.println("请输入您要猜的数字（1-10）");
			int guessNumber = sc.nextInt();
			
			//判断
			//加循环
			count--;
			scount++;
			   if(count>0){
					if(guessNumber>number){
						System.out.println("您猜的数字"+guessNumber+"大了！您还有"+count+"次机会，请您再次输入...");
					}else if(guessNumber<number){
						System.out.println("您猜的数字"+guessNumber+"小了！您还有"+count+"次机会，请您再次输入...");
					}else{
						if(scount==1){
							System.out.println("==天才==您用了"+scount+"次猜中，恭喜您，您猜对了！猜中数字为："+guessNumber);
						}else if(scount>=2 &&scount<=3){
							System.out.println("==优秀==您用了"+scount+"次猜中，恭喜您，您猜对了！猜中数字为："+guessNumber);
						}else{
							System.out.println("=表现一般==您用了"+scount+"次猜中，恭喜您，您猜对了！猜中数字为："+guessNumber);	
						}
						
						break;
					}
			   }else{
				   System.out.println("sorry！您的次数已经用完！欢迎下次再来...");
				   System.out.println("-------------------------------------------------");
				   break;
			   }
			
		}
	
		
		
		
	}
   
}
