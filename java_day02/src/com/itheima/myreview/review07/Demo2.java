package com.itheima.myreview.review07;

import java.util.Scanner;

/*
 * ������������Ĳ��裺
 * 1.����(�ֹ�����,ע��S�ڴ�д)
 *   import java.util.Scanner;
 * 2.���������������
 *   Scanner sc = new Scanner(System.in);
 * 3.��ȡһ������
 *   int i = sc.nextInt();
 * 4.������     
 *   System.out.println("i:" + i);
 *   
 * ע�⣺
 *   ������ִ�е�sc.nextInt()������ʱ������ȴ��û������� ��
 *   ֱ���û����˻س�Ϊֹ  
 */
public class Demo2 {
	public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       
       //��ʾ�û�����һ��������
       System.out.println("������һ��������");
       
       //ԭ����int i = 10;
       int i = sc.nextInt();
       
       System.out.println("i:" + i);
	}
}
