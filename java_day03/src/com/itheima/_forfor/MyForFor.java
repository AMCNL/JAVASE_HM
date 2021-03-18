package com.itheima._forfor;

import java.util.Scanner;

/*
 * for循环嵌套实现一个四行五列的*
 * 
 * 
 */
public class MyForFor {
	public static void main(String[] args) {
		int i;
		int j;
		Scanner sc = new Scanner(System.in);
		System.out.println("请录入第一个数：");
		i=sc.nextInt();
		System.out.println("请录入第二个数：");
	    //外层循环控制行
		j=sc.nextInt();
		
		for(i=1;i<=4;i++){
		   //内层循环控制列
			for(j=1;j<=5;j++){
				System.out.print("*");
			}
		//内层循环每执行完一次换行
			System.out.println();
		}
		
		
		
	}
	

}
