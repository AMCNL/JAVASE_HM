package com.itheima.myreview.review07;

//1.����
import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		
		//2.��������¼�����
		Scanner sc = new Scanner(System.in);
		
		//��ʾ
		System.out.print("�����һ������");
		//3.����int���͵�����
		int num1 = sc.nextInt();
		
		//��ʾ
		System.out.print("����ڶ�������");
		//����int���͵�����
		int num2 = sc.nextInt();
		
		//����
		int sum = num1 + num2;
		
		//��������
		System.out.println("���Ϊ:" + sum);
	}
	
}
