package com.itheima._homework.high;

import java.util.Random;

import javax.naming.ldap.Rdn;

/*
	������1-10���浽һ������Ϊ10��һά������
	����һ��������,����Ϊ3,ȡ��ԭ���������������Ԫ��(�������Ƿ��ظ�)
	���������Ԫ�ظ�ֵ
	������������Ԫ�صĺ�
 */
public class Test01 {

	public static void main(String[] args) {
		//����Ϊ10��һά������
		int[] arr1 = new int[10];
		
		//ΪԪ�ظ�ֵ
		for(int i=0;i<arr1.length;i++){
			arr1[i] = i+1;
		}
		
		//����һ��������,����Ϊ3
		int[] arr2 = new int[3];
		
		Random rd = new Random();
		
		//����һ��sum��ͱ���
		int sum = 0;
		for (int i = 0; i < arr2.length; i++) {
			arr2[i] = rd.nextInt(10);
			
			//���
			sum +=arr2[i];
			System.out.println(arr2[i]);
		}
		System.out.println("sum:"+sum);

	}

}
