package com.itheima.homework.high;

import java.util.Random;
import java.util.Scanner;

/*
 * ĳ�̳�ʵ���µĳ齱���������Ա�ŵİ�λ���ֵ��ڲ�����������֣�
 * ��û�ԱΪ���˻�Ա����ʵ������Ҫ��
 * �Ӽ����Ͻ��ջ�Ա��,ʹ��if-elseѡ��ṹʵ�����˳齱
 * 
 *  1.���������
	2.�ӿ���̨����һ��4λ��Ա��
	3.�ֽ��õİ�λ����
	4.�жϸû�Ա�Ƿ������˻�Ա
    5.���ո�ʽ��ӡ
 */
public class Test05 {
	public static void main(String[] args) {
		//��������¼�����
		Random rd = new Random();
		
		//������������������������1-9
		int num = rd.nextInt(9)+1;
		
		
		//��������¼�����
		Scanner sc = new Scanner(System.in);
		
		System.out.println("���������Ļ�Ա���ţ�");
		//����һ����Ա�ű��������ռ���¼�������
		int IdNum = sc.nextInt();
		
		//�����λ
		int bai = IdNum/100%10;
		
		System.out.println("��������Ϊ��"+num);
		//�����ж�
		if(bai == num){
			//����������ӡ���
			System.out.println("��ϲ��Ϊ���˻�Ա��");
		}else{
			
			System.out.println("лл���룡");
		}
	
		
	}

}
