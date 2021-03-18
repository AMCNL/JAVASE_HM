package com.itheima.methodPrint;

import java.util.Scanner;

/*
 * 需求： 1-输出1-n（n通过键盘录入）
 *      2-输出1-n之和
 *      3-1-n偶数之乘积
 *  
 */
public class Test01 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个数：");
		int num = sc.nextInt();
		printNum(num);
		
		//解决1-n之和
		int sum=sum(num);
		System.out.println("sum:"+sum);
		//解决1-n乘积
		int ji = ji(num);
		System.out.println("ji:"+ji);
		
	}
	
	/*
	 * 输出1-n
	 * 返回值类型：void
	 * 参数列表：int n
	 */
	public static void printNum(int n){
		for (int i = 0; i < n; i++) {
			System.out.println(i);
		}
	}
	
	
	public static int sum(int n){
		int sum = 0;
		for(int i=0;i<=n;i++){
			if(i%2==0){
				sum +=i;
			}
		}
		return sum;
	}
	
	public static int ji(int n){
		int ji = 1;
		for(int i=1;i<=n;i++){
			if(i%2==0){
				ji *=i;
			}
		}
		return ji;
	}

}
