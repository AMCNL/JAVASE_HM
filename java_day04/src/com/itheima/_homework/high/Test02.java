package com.itheima._homework.high;

import java.util.Random;
import java.util.Scanner;

/*
 * �����������󣬲��ô���ʵ��
	1.����¼��༶����
	2.����¼��İ༶������������
	3.�������������0-100�ĳɼ�(����0��100)
	4.Ҫ��:
		(1)��ӡ�ð༶�Ĳ���������
		(2)��ӡ�ð༶��ƽ����
		(3)��ʾ��ʽ����:
			������༶����:
			����¼��:100
			����̨���:
			����������:19
			�༶ƽ����:87
			
	˼·��		
	1.��������¼�����
	2.����int���͵ı���num����ͨ������¼���num��ֵ
	3.����int���͵����飬���鳤��Ϊnum
	4.����Random����
	5.��������
		(1)�������[0-100]��ֵ
		(2)�������������ֵ��ֵ�������еĵ�ǰԪ��
	6.�������count����ͳ�Ʋ�����ѧԱ�������������sum����ͳ���ܷ�
	7.��������
		(1)����ǰԪ�ص�ֵ�ۼӵ�sum��
		(2)�жϵ�ǰԪ�ص�ֵ���<60,count++
	8.��ӡ������������ƽ���֣�sum/num��
 */
public class Test02 {

	public static void main(String[] args) {

		// ��������¼�����
		Scanner sc = new Scanner(System.in);
		// ����¼��༶����
		System.out.println("������༶������");

		int num = sc.nextInt();
		// ���������ʾ�༶����
		int[] arr = new int[num];

		// �����������
		Random rd = new Random();

		// �����������
		int count = 0;
		
		//������ͱ���
	    int sum = 0;
	    
		// ѭ����ֵ
		for (int i = 0; i < arr.length; i++) {

			// �����������Ԫ�ظ�ֵ
			arr[i] = rd.nextInt(101);
            System.out.println("��"+(i+1)+"λͬѧ�ĳɼ�Ϊ��"+arr[i]);
			//�ж�����
			if (arr[i] < 60) {
				count++;
			}
			
			//�ۼ����
			sum += arr[i];
		}
		
		System.out.println("����������:"+count);
		
		//ƽ����
		double vag = (double)(sum)/num;
		
		//��ӡ���
		System.out.println("�༶ƽ����:"+vag);
	}

}
