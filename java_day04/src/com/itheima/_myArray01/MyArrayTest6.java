package com.itheima._myArray01;
/*
		ʹ�þ�̬��ʼ������һ������Ϊ4������
		Ϊ�����е�Ԫ�ظ�ֵΪ11,33,77,22
		��������е���Сֵ����ӡ


 */
public class MyArrayTest6 {

	public static void main(String[] args) {
		//����һ��int���ͣ�����Ϊ4������
		
		int[] arr = new int[4];
		
		arr[0] = 11;	
		arr[1] = 33;
		arr[2] = 77;
		arr[3] = 22;
		
		int max=arr[0];
		int min=arr[0];
		for(int i=0;i<arr.length;i++){
			if(arr[i]>max){
				max = arr[i];
			}
			
			if(arr[i]<min){
				min = arr[i];
			}int sum=0;
		}
		System.out.println("���ֵΪ��"+max);
		System.out.println("��СֵΪ��"+min);
		

	}

}
