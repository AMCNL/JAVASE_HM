package com.itheima.homework.high;

import java.util.Scanner;

/*
 * ѭ��¼��ĳѧ����5�ſγ̵ĳɼ�������ƽ���֡�
 * ���ĳ����¼��Ϊ������ֹͣ¼�벢��ʾ¼�����
 * 
 * ˼·��
 *  1.��������¼�����
	2.����int���͵ı���sum(�ܷ�)��avg(ƽ����)��
	     ���������ĳ�ʼֵλ0,String���͵ı���name����ʾѧԱ����
	3.����boolean���͵ı���flag(��ʾ��ѧ����5�ųɼ��Ƿ���ȷ¼�룬
	     �����һ��Ϊ��ֵ����ֵΪtrue����ʾ¼�����)����ʼֵΪfalse
	4.����forѭ����¼��5���ɼ�
		(1)�жϵ�ǰ�ĳɼ����С��0��flag��ֵΪtrue����ֹforѭ��
		(2)���������ǰ¼��ĳɼ�>=0,�ۼ����
	5.��ӡ���
		(1)���flagΪtrue����ӡ¼�����
		(2)�������flagΪfalse����ӡ�ֺܷ�ƽ����
 */
public class Test04 {
	public static void main(String[] args) {
		//����int���͵ı���sum(�ܷ�)��avg(ƽ����)
		int sum = 0;
		int vag = 0;
		
		//ѧ������
		String name;
		
		//�����Ǳ���
		boolean flag = false;
		
		//�������¼�����
		Scanner sc = new Scanner(System.in);
		
		//FORѭ��¼������
		
		
		for(int i=1; i<=5;i++){
			System.out.println("�������"+i+"�ſγ̵ĳɼ���");
			int score = sc.nextInt();
			if(score<0){
				flag = true;
				break;
			}
			//���
			sum +=score;
		}
		
		if(flag){
			System.out.println("���������Ϣ����");
			
		}else{
			//��ӡ���
			System.out.println("sum:"+sum);
			
			//��ƽ����
			vag = sum/5;
			//��ӡƽ����
			System.out.println("vag:"+vag);
		}
		
	}

}
