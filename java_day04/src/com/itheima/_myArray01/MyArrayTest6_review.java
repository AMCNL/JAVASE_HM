package com.itheima._myArray01;
/*
		ʹ�þ�̬��ʼ������һ������Ϊ4������
		Ϊ�����е�Ԫ�ظ�ֵΪ11,33,77,22
		��������е���Сֵ����ӡ


 */
public class MyArrayTest6_review {

	public static void main(String[] args) {
		//����һ������Ϊ4������
		int[] arr = new int[4];
		
		//Ϊ�����е�Ԫ�ظ�ֵΪ11,33,77,22
		arr[0] = 11;
		arr[1] = 33;
		arr[2] = 77;
		arr[3] = 22;
		
		//����һ����С���ձ���
		int min = arr[0];
		//��������
		for(int i=0;i<arr.length;i++){
			//�ж�����
			if(arr[i]<min){
				min = arr[i];
			}
		}
		
		//�����ӡ
		System.out.println("min:"+min);
		
		
		System.out.println("--------------------------");
		//����һ����С���ձ���
		int min1=arr[0];
		
		//whileѭ������
		//����һ��ѭ������
		int j = 0;
		while(j<arr.length){
			if(arr[j]<min1){
				min1 = arr[j];
			}
			j++;
		}
		
		//��ӡ���
		System.out.println("min1:"+min1);

	}

}
