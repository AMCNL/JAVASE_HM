package com.itheima.myArraySort;
/*
 * ð������
 */
public class SortDemo {

	public static void main(String[] args) {
		
		
		int[] arr = {9,8,5,12,3};
		
		
		
		/*System.out.println("��һ�α���");
		for(int i=0;i<arr.length-1;i++){
			if(arr[i]>arr[i+1]){
				int temp = arr[i];
				arr[i] = arr[i+1];
				arr[i+1] = temp;
			}
		}
		printArray(arr);
		
		
		System.out.println("�ڶ��α���");
		for(int i=0;i<arr.length-1-1;i++){
			if(arr[i]>arr[i+1]){
				int temp = arr[i];
				arr[i] = arr[i+1];
				arr[i+1] = temp;
			}
		}
		printArray(arr);
		
		
		System.out.println("�����α���");
		for(int i=0;i<arr.length-1-1;i++){
			if(arr[i]>arr[i+1]){
				int temp = arr[i];
				arr[i] = arr[i+1];
				arr[i+1] = temp;
			}
		}
		printArray(arr);
		
		System.out.println("���Ĵα���");
		for(int i=0;i<arr.length-1-1;i++){
			if(arr[i]>arr[i+1]){
				int temp = arr[i];
				arr[i] = arr[i+1];
				arr[i+1] = temp;
			}
		}
		printArray(arr);*/
		
		//Ƕ��ѭ�����
		/*for (int i = 0; i < arr.length-1; i++) {
			
			for (int j = 0; j < arr.length-1; j++) {
				if(arr[j] > arr[j+1]){
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
			System.out.println("��"+(i+1)+"�������");
			printArray(arr);
		}*/
		
		//����Ļ��ǲ�̫�ã��Ż��÷�����װ������ʵ�ö������
		
		//�������򷽷�
		sort(arr);
		//��ӡ
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
