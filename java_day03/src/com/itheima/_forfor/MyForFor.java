package com.itheima._forfor;

import java.util.Scanner;

/*
 * forѭ��Ƕ��ʵ��һ���������е�*
 * 
 * 
 */
public class MyForFor {
	public static void main(String[] args) {
		int i;
		int j;
		Scanner sc = new Scanner(System.in);
		System.out.println("��¼���һ������");
		i=sc.nextInt();
		System.out.println("��¼��ڶ�������");
	    //���ѭ��������
		j=sc.nextInt();
		
		for(i=1;i<=4;i++){
		   //�ڲ�ѭ��������
			for(j=1;j<=5;j++){
				System.out.print("*");
			}
		//�ڲ�ѭ��ÿִ����һ�λ���
			System.out.println();
		}
		
		
		
	}
	

}
