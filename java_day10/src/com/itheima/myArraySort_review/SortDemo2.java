package com.itheima.myArraySort_review;
/*
 * ð������
		����:��������(ð������)��������(�ɴ�С)
		����:
		��һ��:��������int[] arr = {24,69,80,57,13};
		�ڶ���:���������,ͬʱ�����������
		������:��ӡ�����������Ԫ��

 */
public class SortDemo2 {

	public static void main(String[] args) {
		
		
		int[] arr = {9,8,5,12,3,7};
		
		sort(arr);
		
		
		printArray(arr);
		System.out.println("-----------------------------");
		
		int[] newArr = sort2(arr);
		
		printArray(newArr);
		
		
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
				
				if(arr[j] < arr[j+1]){
					
					int temp = arr[j];
					
					arr[j] = arr[j+1];
					
					arr[j+1] = temp;
					
				}
			}
		}
	}
	
	
	public static int[] sort2(int[] arr){
		
		int[] newArr  = new int[arr.length];
		
		for (int i = 0; i < arr.length; i++) {
			newArr[i] = arr[i];
		}
		
		printArray(newArr);
		
		System.out.println("-------------------------");
		
		
		for (int i = 0; i < (newArr.length/2); i++) {
			
			int temp = newArr[i];
			newArr[i] = newArr[newArr.length-1-i];
			newArr[newArr.length-1-i] = temp;
		}
		
		return newArr;
	}

}
