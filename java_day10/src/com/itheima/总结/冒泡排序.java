package com.itheima.�ܽ�;

/*
 * ����Ԫ���໥�Ƚ�
 */
public class ð������ {

	public static void main(String[] args) {
		// ���Ĵ���
		int[] arr = { 7, 4, 1, 8, 5, 2 };

		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr.length - 1 - i; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[i];
					arr[i] = arr[i + 1];
					arr[i + 1] = temp;
				}
			}
		}

	}

}
