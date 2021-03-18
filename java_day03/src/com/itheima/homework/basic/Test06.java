package com.itheima.homework.basic;

import java.util.Random;
import java.util.Scanner;

/*
 * 猜数字小游戏
 */
public class Test06 {
	public static void main(String[] args) {
	    Random rd = new Random();
	    int rdnum=rd.nextInt(100)+1;
		
		while(true){

			System.out.println("请输入一个数字：");
			Scanner sc = new Scanner(System.in);
			int gussnum=sc.nextInt();
			
			if(gussnum>rdnum){
				System.out.println("您猜的数大了！");
			}else if(gussnum<rdnum){
				System.out.println("您猜的数小了！");
			}else{
				System.out.println("恭喜您猜对了！");
				break;
			}
		}
		
	}

}
