package com.itheima.homework.basic;

/*
 * ����һ������,ʵ��ͬʱ������������ļӡ������ˡ����Ľ��,
       ͬʱ������ĸ��������(���ĸ������뵽һ�������в�����)
 */
public class Test07 {

	public static void main(String[] args) {

		int[] arr = result(10, 5);
		System.out.println("�����ĺ�Ϊ��"+arr[0]);
		System.out.println("�����Ĳ�Ϊ��"+arr[1]);
		System.out.println("�����ĳ�Ϊ��"+arr[2]);
		System.out.println("��������Ϊ��"+arr[3]);
	}
	
	/*
	 * ����һ������,ʵ��ͬʱ������������ļӡ������ˡ����Ľ��,
	 * ͬʱ������ĸ��������(���ĸ������뵽һ�������в�����)
	 * ����ֵ���ͣ�int[] arr
	 * �����б� int a��int b
	 */
	
	public static int[] result(int a,int b){
		int[] arr = new int[4];
		
		arr[0] = a+b;
		arr[1] = a-b;
		arr[2] = a*b;
		arr[3] = a/b;
		
		return arr;
	}

}
