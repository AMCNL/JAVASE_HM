package com.itheima._homework.basic;

import java.util.Random;

/*
 * ����һ������Ϊ3��һά����,��ÿ��Ԫ�ظ�ֵ. 
 * (Ҫ��������ÿ��Ԫ�ص�ֵ��0-9�������)
 * ���������ӡÿ��Ԫ�ص�ֵ
 * 
	1.���峤��Ϊ3������
	2.����Random�����������͵ı���
	3.����3��0-9�������,Ϊÿһ��Ԫ�ظ�ֵ(������ѭ��,Ҳ���Բ�ʹ��ѭ��)
	4.�������飬����ӡÿһ��Ԫ��
 */
public class Test02 {

	public static void main(String[] args) {
		
		int[] arr = new int[3];
		
		Random rd = new Random();
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = rd.nextInt(9);
			System.out.println("arr["+i+"]"+arr[i]);
		}
		
		System.out.println("-----------�Լ�д---------");
		
		
		/*
		int[] arr = new int[3];
		//�������������
		Random rd = new Random();
		
		//ѭ��
		for (int i = 0; i < arr.length; i++) {
			
			//ΪԪ�ظ�ֵ
			arr[i] = rd.nextInt(10);
			
			//��ӡ���
			System.out.println("arr["+i+"]:"+arr[i]);
		}
		*/
		
  
	}

}
