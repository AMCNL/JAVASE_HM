package com.itheima._myArray01;
/*
		使用静态初始化定义一个长度为4的数组
		为数组中的元素赋值为11,33,77,22
		求出数组中的最小值并打印


 */
public class MyArrayTest6 {

	public static void main(String[] args) {
		//定义一个int类型，长度为4的数组
		
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
		System.out.println("最大值为："+max);
		System.out.println("最小值为："+min);
		

	}

}
