package com.itheima.homework.high;

import java.util.Scanner;

/*
		 ����һ���򵥵���ATM��ȡ��������£�������ʾ�û��������루password����
		���ֻ������3�Σ�����3������ʾ�û�"���������ȡ��"���׽�����
		����û�������ȷ������ʾ�û������amount����ATMֻ�����100Ԫ��ֽ�ң�
		һ��ȡǮ��Ҫ�����0Ԫ�����1000Ԫ��
		����û�����Ľ���������Ҫ�����ӡ����û�ȡ��Ǯ����
		�����ʾ�û�"������ɣ���ȡ��"��������ʾ�û����������
		�����û�������"111111"��
		
		��ӡ��ʽ��

		��һ����������������������
		���������룺2
		����������������룺3
		����������������룺4
		���������ȡ��
		
		�ڶ������������������ȷ������ȡ��
		���������룺2
		����������������룺111111
		������ȡ���3000
		�������ȡ�����������������룺999
		��ȡ���ֽ�999Ԫ
		������ɣ���ȡ��
 */
public class Test07 {
	public static void main(String[] args) {
		//��������¼�����
		Scanner sc = new Scanner(System.in);
		System.out.println("���������룺");
		
		//����¼�������
		int inputPwd = sc.nextInt();
		//ȡ������
		int pwd = 123456;
		
		//����ȡ�����
		int count = 2;
		
		while(inputPwd!=pwd){
			System.out.print("����������������룺");
			System.out.println();
			inputPwd = sc.nextInt();
			count --;
			if(count==0){
				System.out.println("���������ȡ��");
				return;
			}
		}
		
		System.out.print("������ȡ���");
		//���������
		int money = sc.nextInt();
		while(true){
			if(money<100 || money>1000 || money%100!=0){
				System.out.print("�������ȡ�����������������룺");
				money = sc.nextInt();
			}else{
				System.out.println("��ȡ���ֽ�"+money);
				System.out.println("������ɣ���ȡ��!");
				break;
			}
		}
		
		
		
		
	}

}
