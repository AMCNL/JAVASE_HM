package com.itheima.homework.basic;



/*
 * �������и�������int[] arr= {10,20,30,40,50,60};����һ���������Խ����������������
       ���������������Ԫ�ص���Сֵ
 */
public class Test03 {

	public static void main(String[] args) {

		// ��������
		int[] arr = { 10, 20, 30, 40, 50, 60 };

		// ��������Сֵ����
		int min = getMin(arr);
		System.out.println("min:" + min);
	}

	/*
	 * ���������е���Сֵ
	 */
	public static int getMin(int[] arr) {
		int min = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[0] < min) {
				min = arr[0];
			}
		}
		return min;
	}

}
