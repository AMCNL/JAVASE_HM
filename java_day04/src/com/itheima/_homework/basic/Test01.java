package com.itheima._homework.basic;
/*
 * ����һ���������Ԫ�ص�����,��Ϊÿ��Ԫ�ظ�ֵ,������������Ԫ�ص���Сֵ
	1.����5��Ԫ������
	2.����ʹ�ó�ʼ����������ַ�ʽ֮һΪ����Ԫ�ظ�ֵ
	3.���������������е���Сֵ
 */
public class Test01 {

	public static void main(String[] args) {
		//����һ���������Ԫ�ص�����
		int[] arr = new int[5];
		
		//Ϊÿ��Ԫ�ظ�ֵ
		arr[0] = -1;
		arr[1] = 2;
		arr[2] = 3;
		arr[3] = 4;
		arr[4] = 5;
		
		int min = arr[0];
		
		//����Ԫ��
		for (int i = 0; i < arr.length; i++) {
			
			if(arr[0]<min){
				min = arr[0];
			}
			
		}
		//��ӡ��Сֵ
		System.out.println("min:"+min);
		
		
		
		

	}

}
