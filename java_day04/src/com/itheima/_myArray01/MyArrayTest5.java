package com.itheima._myArray01;
/*
		 ����һ������Ϊ8������
		�����е�ÿ��Ԫ��ֵ���Ƕ�Ӧ������+2
		������������е�����Ԫ��

 */
public class MyArrayTest5 {

	public static void main(String[] args) {
		//����һ��int���ͣ�����Ϊ8������
		int[] arr = new int[8];
		
		
		for(int i=0;i<arr.length;i++){
			//Ϊÿ������Ԫ�ظ�ֵ
			arr[i]=i+2;
			//��ӡ��������
			System.out.println("arr["+i+"]��"+arr[i]);
		}
		
		

	}

}
