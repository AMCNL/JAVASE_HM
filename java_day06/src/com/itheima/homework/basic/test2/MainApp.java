package com.itheima.homework.basic.test2;

import java.util.Scanner;

/*
 * ѧԱ��ţ�String�� 
		������String��
		�Ա�String��
		��ߣ�double��
		���䣨int��
 */
public class MainApp {

	public static void main(String[] args) {
		
		//��������¼�����
		Scanner sc = new Scanner(System.in);
		
		System.out.println("������ѧԱ��ţ�");
		String numId = sc.nextLine();
		
		System.out.println("������ѧԱ������");
		String name = sc.nextLine();
		
		System.out.println("������ѧԱ�Ա�");
		String sex = sc.nextLine();
		
		System.out.println("������ѧԱ��ߣ�");
		double height = sc.nextDouble();

		System.out.println("������ѧԱ���䣺");
		int age = sc.nextInt();
		
		//����ѧԱ����
		Student s = new Student(numId,name,sex,height,age);
		
		System.out.println("ѧԱ���\tѧԱ����\tѧԱ�Ա�\tѧԱ���\tѧԱ����");
		System.out.println(numId+"\t"+name+"\t"+sex+"\t"+height+"\t"+age);
		
		
		
		
		
		

	}

}
