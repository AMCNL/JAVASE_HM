package com.itheima.myreview.review07;

import java.util.Scanner;
/*
 * ���󣺼���¼���������ݣ�����������������ͣ��������
 */
public class ScannerTest {
	public static void main(String[] args) {
		//��������¼�����
		Scanner sc = new Scanner(System.in);
		
		//������ʾ
		System.out.println("�������һ��������");
		int a = sc.nextInt();
		
		System.out.println("������ڶ���������");
		int b = sc.nextInt();
		
		//���������
		int sum = a + b;
		
		//������
		System.out.println("sum:"+sum);
	}
}