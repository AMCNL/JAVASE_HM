package com.itheima.homework.hight;

/*
 * �������и�������int[] arr= {10,20,30,40,50,60};�������û���ظ�Ԫ��.
 * ����һ���������Խ���������������鲢����������������Ԫ��ֵ������ֵ
 */
public class Test01 {

	public static void main(String[] args) {
		int[] arr= {10,20,30,40,50,60};
		
		int num=showIndex(arr);
		System.out.println(num);
		
		
	}
	
	/*
	 * ����ֵ���� int index
	 * �����б�int[] arr
	 */
	public static int showIndex(int[] arr){
		int max = arr[0];
		
		//������ֵ
		for (int i = 0; i < arr.length; i++) {
		     if(arr[i]>max){
		    	 max = arr[i]; 
		     }	
		}
		
		//�ж����ֵ����
		for (int i = 0; i < arr.length; i++) {
			
			if(arr[i] == max){
				return i;
			}
		}
		
		return 0;
		
	}

}
