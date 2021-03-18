package com.itheima.homework.basic;

import java.util.Scanner;

/*
 * 从键盘上录入一个大于100的三位数,求出100到该数字之间满足如下要求的数字之和:
		1.数字的个位数不为7;
		2.数字的十位数不为5;
		3.数字的百位数不为3;
 */
public class Test03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个三位数：（100-999）");
		int num = sc.nextInt();
		
		int sum=0;
		
		
		for(int i=100;i<=num;i++){
			int ge = i%10;
			int shi = i/10%10;
			int bai = i/10/10%10;
			
			if(ge!=7 && shi!=5 && bai!=3){
				sum+=i;
			}
		}
		
		
		
		System.out.println(sum);
		
	}

}
