package com.itheima._random;

import java.util.Random;

/*
 * ʹ��random��ȡ1-100��һ�������
 */
public class MyRandom {
	public static void main(String[] args) {
		Random rd = new Random();
		//���÷�Χ[0-99]+1=[1-100]
		
		
		//ѭ�����10��
		for (int i = 0; i < 10; i++) {
			int number=rd.nextInt(100)+1;
			
			
			System.out.println(number);
		}
		
	}

}
