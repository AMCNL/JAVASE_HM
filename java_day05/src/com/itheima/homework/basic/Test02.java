package com.itheima.homework.basic;

import java.util.Random;

/*
 * ���������������,������ķ�Χ����[1,100],���巽���������������ĺͲ���ӡ��ֵ
 */
public class Test02 {

	public static void main(String[] args) {
		//�����������
		Random rd = new Random();
		
		//��ֵ�������a
		int a = rd.nextInt(100)+1;
		
		//��ֵ�������b
		int b = rd.nextInt(100)+1;
		
		//���÷�������ֵ
		int sum=sum(a,b);
		
		//��ʹ�ӡ
		System.out.println("sum:"+sum);

	}
	
	/*
	 * ���巽���������������ĺͲ���ӡ��ֵ
	 * ����ֵ���ͣ�int
	 * �����б�int a��int b
	 */
	public static int sum(int a,int b){
		
		return a+b;
		
	}

}
