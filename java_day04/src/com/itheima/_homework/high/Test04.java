package com.itheima._homework.high;

import java.util.Scanner;

/*
		������һ������Ϊ5�����飬����Ԫ��ͨ������¼�룬������ʾ��
		int[] arr = {1,3,-1,5,-2}
		Ҫ��
		����һ��������newArr[],��������Ԫ�صĴ��˳����ԭ�����е�Ԫ������
		�������ԭ�����е�Ԫ��ֵС��0��
		���������а�0�洢��������ԭ������������е�����
			
			
		��ӡ��ʽ��
		������5��������
		1
		3
		-1
		5
		-2
		ԭ�������ݣ�
		1 3 -1 5 -2 
		���������ݣ�
		0 5 0 3 1
 */
public class Test04 {

	public static void main(String[] args) {
		//����һ������
		int[] arr = {1,3,-1,5,-2};
		
		//�����µ�����
		int[] newArr = new int[5];
		
		//����¼�����
		Scanner sc = new Scanner(System.in);
		
		System.out.println("������5������");
		for (int i = 0; i < arr.length; i++) {
			
			arr[i] = sc.nextInt();
			System.out.println();
			
		}
		System.out.println("ԭ�������ݣ�");
		
		//ѭ����������
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		System.out.println("���������ݣ�");
		
	    for (int i = 0; i < newArr.length; i++) {
			
			if(arr[arr.length-1-i]<0){
				arr[arr.length-1-i] = 0;
				
			}
			
			//ִ�и�ֵ��������һ�������ֵ����ֵ����һ������
			newArr[i] = arr[arr.length-1-i];
			
			System.out.print(newArr[i]+" ");
		}
		
		

	}

}
