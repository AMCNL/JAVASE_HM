package com.itheima.homework.high;

import java.util.Scanner;

/*
 * ѭ��¼��ѧԱJava�γ̵ĳɼ���ѧԱ�����ɼ���¼�룩��
 * ͳ�Ʒ������ڵ���80�ֵ�ѧ���ı�����
 * 
 * ˼·��
 * ������������Ŀ����if��switch�����ԣ����������switch��
		1.��������¼�����
		2.����int���͵ı���score6(ѧԱ�ɼ�)��total(ѧԱ����)��count(>=80�ֵ�ѧԱ����)
		3.ͨ������¼�������total������ֵ
		4.����forѭ��(ѭ������Ϊtotal)��ѭ��¼��ѧԱ�ɼ�
			(1)��ȡ��ǰ����¼��ĳɼ�
			(2)�жϸóɼ����<80,continue���������´�¼��
			(3)��������ĳɼ�>=80,count++
		5.����double���͵�rate��������80�����ϵı�������ֵ��rate
		6.��ӡ���յ� ������
 */
public class Test06 {
	public static void main(String[] args) {
		//��������¼�����
		Scanner sc = new Scanner(System.in);
		
		System.out.println("������ѧԱ������");
		//��������
		int total = sc.nextInt();
		
		//��������
		int count = 0;
		
		//�ɼ�����
		int score = 0;
		
		for(int i=1;i<=total;i++){
			System.out.println("�������"+i+"λͬѧ�ĳɼ���");
			score = sc.nextInt();


			//�����ж�
			if(score<80){
				
				continue;
				
			}
			
			count++;
			
		}
		
		//�������������ע������
		double rate = (double)count/total*100;
		
		System.out.println("����80�����ϵı���Ϊ��"+rate+"%");
		
	}

}
