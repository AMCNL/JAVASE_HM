package com.itheima._myArray01;

/*
 * ��һ������ĵ�ֵַ��ֵ����һ�����飬������һ������
 */
public class MyArrayTest3 {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5 };
		// ��������int���͵�����
		int[] arr1 = arr;
		int[] arr2 = arr;
		// ��1��ֵ
		arr1[0] = 11;
		arr1[1] = 22;
		arr1[2] = 33;
		arr1[3] = 44;
		arr1[4] = 55;
		// ������ӡ����
		for (int i = 0; i < arr2.length; i++) {
			System.out.println("arr2[" + i + "]:" + arr2[i]);
		}

	}

}
