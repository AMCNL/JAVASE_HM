package com.itheima._myArray_busi;
/*
 * ��չ����������50����
 * ע�⣺����Ҫ��long����
 */
public class Test1 {

	public static void main(String[] args) {
		
		//����һ��long���͵����飬���鳤��Ϊ50
		long[] arr = new long[50];
		
		//��һ����ʱ���ӵĶ���
		arr[0] = 1;
		
		//�ڶ����µ�ʱ�����ӵĶ���
		arr[1] = 1;
		
		for(int i=2;i<arr.length;i++){
			arr[i] = arr[i-1]+arr[i-2];
		}
		
		//�õ�50���º�����Ӷ���
		long sum = arr[arr.length-1];
		
		//��ӡ���
		System.out.println(sum);

	}

}
