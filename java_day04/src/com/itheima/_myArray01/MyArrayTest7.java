package com.itheima._myArray01;

import java.util.Scanner;
/*
		������ί��ְ���:
		    ����¼�� 6��������ȥ��һ����߷ֺ���ͷ֣��ó����ƽ��������
 */
public class MyArrayTest7 {

	public static void main(String[] args) {
		//����һ��int���ͣ�����Ϊ6������
		int[] arr = new int[6];
		Scanner sc = new Scanner(System.in);
		int max = arr[0];
		int min = arr[0];
		//����һ����ͱ���
		int sum=0;
		//����һ��ƽ��ֵ����
		int avg=0;
		for(int i=0;i<arr.length;i++){
			System.out.print("������ڸ�"+(i+1)+"����:");
			arr[i] = sc.nextInt();
			
			//�����߷�
			if(arr[i]>max){
				max = arr[i];
			}
			//�����ߵͷ�
			if(arr[i]<min){
				min = arr[i];
			}
			
			sum += arr[i];
			
		}
		
		avg = (sum-max-min)/(arr.length-2);
		System.out.println("ȥ��һ����ͷ֣�ȥ��һ����߷֣���ίƽ�ַ�Ϊ��"+avg);

	}

}
