package com.itheima._homework.basic;

import java.util.Random;
import java.util.Scanner;

/*
 * ����¼��һ������������һ���ó��ȵ����飬
 * Ϊÿһ��Ԫ�ظ�ֵΪ1-10���������������ӡ����������ֵ����5��Ϊż����Ԫ��.
 * 
 * ˼·��
		1����¼��һ������
		2���峤��Ϊ������������
		3����Random�����������͵ı���
		4����5��0-9�������,Ϊÿһ��Ԫ�ظ�ֵ(������ѭ��)
		5 ��������,�������������Ԫ��
 *    
 */
public class Test04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("������һ������");
		int num = sc.nextInt();

		// ����һ��int���͵����飬���鳤��Ϊnum
		int[] arr = new int[num];

		// ����¼�����
		Random rd = new Random();
        
		int count=0;
		//��������Ԫ��
		for (int i = 0; i < arr.length; i++) {
			//ΪԪ�ظ�ֵ
			arr[i] = rd.nextInt(10) + 1;

			//�����ж�
			if (arr[i] > 5 && arr[i] % 2 == 0) {
				count++;
				//��ӡ���
				System.out.println("��������������Ԫ���У�"+arr[i]);
			}
			
			if(count==0){
				System.out.println("û�з���������ֵ");
			}
		}

	}

}
