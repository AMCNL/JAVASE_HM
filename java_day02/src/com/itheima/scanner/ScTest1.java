package com.itheima.scanner;

import java.util.Scanner;

public class ScTest1 {
	public static void main(String[] args) {
		//�����������
		Scanner sc = new Scanner(System.in);
		
		System.out.println("�������һ������");
		int a = sc.nextInt();
		
		System.out.println("������ڶ�������");
		int b = sc.nextInt();
		
		System.out.println("���������������");
		int c = sc.nextInt();
		
		//�ȱȽ�ab��ֵ����õĽϴ�ֵ��ֵ����ʱ����temp
		int temp = (a > b) ? a : b;
		//�ж�temp��ֵ��c�Ƚϣ��õ��Ľϴ�ֵ��ֵ��max
		int max = (temp>c) ? temp:c;
		
		//һ���㶨
		int max1 = a>b?(a>c?a:c):(b>c?b:c);
		
		System.out.println("���ֵΪ��"+max);
		System.out.println("���ֵΪ��"+max1);
		
	}

}
