package com.itheima.homework.basic;



/*
 * ����һ������,��������������ڸ���int�������г��ֵĴ���,���һ��û�г����򷵻�0��
        ��:��������3 ���3������ int[] arr = {3,4,3,5,7,9};�г��ֵĴ��� 
 */
public class Test05 {

	public static void main(String[] args) {
		// ��������
		int[] arr = { 3, 4, 3, 5, 7, 9 };

		int num = 3;
		// ���÷������ݲ���
		int count = count(arr, num);

		// ��ӡ���
		System.out.println(num + "���ֵĴ�������" + count + "�Σ�");

	}

	/*
	 * ����һ������,��������������ڸ���int�������г��ֵĴ���,
	 * ���һ��û�г����򷵻�0�� ����ֵ���ͣ�int �����б�int[] arr,int
	 * num
	 */

	public static int count(int[] arr, int num) {
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == num) {
				count++;
			}
		}
		return count;
	}
}
