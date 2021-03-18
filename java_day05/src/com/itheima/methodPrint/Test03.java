package com.itheima.methodPrint;

import java.util.Scanner;

/*
 * ���� ��������int arr = {13,52,37,41,59,46,88}
		����һ��������ȡ�����е����ֵ
		����һ��������ȡ�����е���Сֵ
		Ҫ��
		1.ȷ�������Ĳ����б�
		2.ȷ�������ķ���ֵ����
		3.��main�����д�ӡ��Сֵ�����ֵ

 *  
 */
public class Test03 {
	public static void main(String[] args) {
		// ����һ������
		int[] arr = { 13, 52, 37, 41, 59, 46, 88 };

		// �������ֵ����
		int max = getMax(arr);
		System.out.println("max:" + max);
		System.out.println("-----------------");
		// �������ֵ����
		int min = getMin(arr);
		System.out.println("min:" + min);
		System.out.println("-----------------");
		// ������ͷ���
		int sum = getSum(arr);
		System.out.println("sum:" + sum);
		System.out.println("-----------------");
		// ����ƽ��ֵ����
		double avg = getAvg(arr);
		System.out.println("avg:" + avg);
		System.out.println("###############################");
		
		int[] rs = getMaxAndMin(arr);
		System.out.println("���ֵΪ��"+rs[0]+",��СֵΪ��"+rs[1]);
		

	}

	/*
	 * ����һ��������ȡ�����е����ֵ ����ֵ���ͣ�int �����б�int[] arr
	 */
	public static int getMax(int[] arr) {
		int max = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		return max;
	}

	/*
	 * ����һ��������ȡ�����е���Сֵ ����ֵ���ͣ�int �����б�int[] arr
	 */
	public static int getMin(int[] arr) {
		int min = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] < min) {
				min = arr[i];
			}
		}
		return min;
	}

	/*
	 * ����һ��������ȡ�����еĺ� ����ֵ���ͣ�int �����б�int[] arr
	 */
	public static int getSum(int[] arr) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		return sum;
	}

	/*
	 * ����һ��������ȡ�����е�ƽ��ֵ ����ֵ���ͣ�int �����б�int[] arr
	 */
	public static double getAvg(int[] arr) {
		int sum = getSum(arr);
		double vag = (double) sum / arr.length;
		return vag;
	}
	
	/*
	 * ͨ�����鷽�����������ֵ����Сֵ����ϰ��չ��
	 */
	public static int[] getMaxAndMin(int[] arr){
		int max = arr[0];
		int min = arr[0];
		
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] > max){
				max = arr[i];
			}
			
			if(arr[i]<min){
				min = arr[i];
			}
			
		}
		
		int[] rs = new int[2];
		rs[0] = max;
		rs[1] = min;
		
		return rs;
	}
}
