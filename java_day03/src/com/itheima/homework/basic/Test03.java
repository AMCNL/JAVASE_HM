package com.itheima.homework.basic;

import java.util.Scanner;

/*
 * �Ӽ�����¼��һ������100����λ��,���100��������֮����������Ҫ�������֮��:
		1.���ֵĸ�λ����Ϊ7;
		2.���ֵ�ʮλ����Ϊ5;
		3.���ֵİ�λ����Ϊ3;
 */
public class Test03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("������һ����λ������100-999��");
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
