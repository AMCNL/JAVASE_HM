package com.itheima._homework.high;

import java.util.Arrays;
import java.util.Random;

/*
		���峤��Ϊ10��int����,�����е�10��Ԫ��Ϊ������ɵ�1-100������
		Ҫ��:��ӡ�����еڶ�������͵ڶ�С������
		��ӡ��ʽ:
		ԭ��������
		90 34 12 35 98 23 17 71 4 66 
		�����еĵڶ��������Ϊ:90
		�����еĵڶ�С������Ϊ:12
		
		
		//��չ��ʹ��ð���������
		 * //ð������1-�����õ�һ��ֵ���θ�����ıȽϣ���������Ⱥ�������󣬾ͽ���ֵ
		  //2-�����ý������ֵ�ͺ���ıȽϣ�ֱ�����õ����ֵ
		 //3-Ȼ���ظ�1��������Ϊ�Ѿ�ȷ�����һλΪ���ֵ���������һλ������Ƚϣ���ÿ�αȽϵĴ���Ҫȥ��һ��

 */
public class Test05 {

	public static void main(String[] args) {
		int[] arr = new int[10];

		Random rd = new Random();

		System.out.println("ԭ��������Ϊ:");

		for (int i = 0; i < arr.length; i++) {
			arr[i] = rd.nextInt(100) + 1;

			System.out.print(arr[i] + " ");

		}
		System.out.println("---------------");
		int max = arr[0];
		int min = arr[0];

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];

			}

			if (arr[i] < min) {
				min = arr[i];
			}

		}

		System.out.println("max:" + max);
		System.out.println("min:" + min);
		System.out.println("------------------------------------");

		int smax = 0;
		int smin = 101;

		// �������������(ð������)
		for (int i = 0; i < arr.length; i++) {

			for (int j = 0; j < arr.length - 1 - i; j++) {
				// ð������1-�����õ�һ��ֵ���θ�����ıȽϣ���������Ⱥ�������󣬾ͽ���ֵ
				// 2-�����ý������ֵ�ͺ���ıȽϣ�ֱ�����õ����ֵ
				// 3-Ȼ���ظ�1��������Ϊ�Ѿ�ȷ�����һλΪ���ֵ���������һλ������Ƚϣ���ÿ�αȽϵĴ���Ҫȥ��һ��

				if (arr[j] > arr[j + 1]) {
					// ���ȶ������ʱ����
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;

				}
			}
			
			//�������
			System.out.print(arr[arr.length - 1 - i] + " ");
		}
		System.out.println();
		System.out.println("-----------------------");
		//�������������������
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

		// System.out.println(arr[arr.length - 1]);
		
		System.out.println();
		System.out.println("--------------------");
		//�ڶ����ֵΪ
		System.out.println("�ڶ����ֵΪ"+arr[arr.length-1-1]);
		//�ڶ�С��ֵΪ
		System.out.println("�ڶ�С��ֵΪ"+arr[1]);

	}

}
