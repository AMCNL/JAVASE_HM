package com.itheima._myArray_pingwei;

import java.util.Scanner;

/*
 * ��ί��ְ�����:
 * 
    
 */
public class MyTest1 {

	public static void main(String[] args) {
		// ����һ��int���飬���鳤��Ϊ6
		int[] arr = new int[6];

		// ��������¼�����
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < arr.length; i++) {
			System.out.print("��Ϊ��" + (i + 1) + "λѡ�ִ�֣�");

			// Ϊ����ÿ��Ԫ�ظ�ֵ
			arr[i] = sc.nextInt();
		}

		int min = arr[0];
		int max = arr[0];
		int sum = 0;

		// ѭ��
		for (int i = 0; i < arr.length; i++) {

			// ������ֵ
			if (arr[i] > max) {
				max = arr[i];
			}

			// �����Сֵ
			if (arr[i] < min) {
				min = arr[i];
			}

			sum += arr[i];
		}
		// ƽ��ֵ
		double avg = (double) (sum - max - min) / (arr.length - 2);

		System.out.println("ѡ�ֵ����յ÷�Ϊ��" + avg);
	}

}
