package com.itheima.myArraySort_review;
/*
 * ð������
		����:��������(ð������)
		����:
		��һ��:��������int[] arr = {24,69,80,57,13};
		�ڶ���:���������,ͬʱ�����������
		������:��ӡ�����������Ԫ��

 */
public class SortDemo {

	public static void main(String[] args) {
		
		
		int[] arr = {9,8,5,12,3};
		
		sort(arr);
		
		
		printArray(arr);
		
		
	}
	
	
	public static void printArray(int[] arr){
		System.out.print("[");
		for (int i = 0; i < arr.length; i++) {
			if(i == arr.length-1){
				System.out.print(arr[i]);
			}else{
				System.out.print(arr[i]+", ");
			}
		}
		System.out.println("]");
	}
	
	/*
	 * ������ð�����򷽷�
	 *  ������ȷ������ֵ����  void    ����Ϊ����Ϊ��������,�βξͿ��Ը�������ʵ�ʵ�ֵ��
	 *          �����б�  ��int[] arr
	 * 
	 */
	
	public static void sort(int[] arr){
		for (int i = 0; i < arr.length-1; i++) {
			for (int j = 0; j < arr.length-1-i; j++) {
				if(arr[j] > arr[j+1]){
					
					int temp = arr[j];
					
					arr[j] = arr[j+1];
					
					arr[j+1] = temp;
					
				}
			}
		}
	}

}
