package com.itheima._myArray01;
/*
		使用静态初始化定义一个长度为4的数组
		为数组中的元素赋值为11,33,77,22
		求出数组中的最小值并打印


 */
public class MyArrayTest6_review {

	public static void main(String[] args) {
		//定义一个长度为4的数组
		int[] arr = new int[4];
		
		//为数组中的元素赋值为11,33,77,22
		arr[0] = 11;
		arr[1] = 33;
		arr[2] = 77;
		arr[3] = 22;
		
		//定义一个最小参照变量
		int min = arr[0];
		//遍历数组
		for(int i=0;i<arr.length;i++){
			//判断条件
			if(arr[i]<min){
				min = arr[i];
			}
		}
		
		//输出打印
		System.out.println("min:"+min);
		
		
		System.out.println("--------------------------");
		//定义一个最小参照变量
		int min1=arr[0];
		
		//while循环遍历
		//定义一个循环变量
		int j = 0;
		while(j<arr.length){
			if(arr[j]<min1){
				min1 = arr[j];
			}
			j++;
		}
		
		//打印输出
		System.out.println("min1:"+min1);

	}

}
