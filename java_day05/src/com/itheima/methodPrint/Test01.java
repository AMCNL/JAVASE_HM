package com.itheima.methodPrint;

import java.util.Scanner;

/*
 * ���� 1-���1-n��nͨ������¼�룩
 *      2-���1-n֮��
 *      3-1-nż��֮�˻�
 *  
 */
public class Test01 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("������һ������");
		int num = sc.nextInt();
		printNum(num);
		
		//���1-n֮��
		int sum=sum(num);
		System.out.println("sum:"+sum);
		//���1-n�˻�
		int ji = ji(num);
		System.out.println("ji:"+ji);
		
	}
	
	/*
	 * ���1-n
	 * ����ֵ���ͣ�void
	 * �����б�int n
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
