package com.itheima._myArray01;
/*
		 定义一个长度为8的数组
		数组中的每个元素值都是对应的索引+2
		遍历输出数组中的所有元素

 */
public class MyArrayTest5 {

	public static void main(String[] args) {
		//定义一个int类型，长度为8的数组
		int[] arr = new int[8];
		
		
		for(int i=0;i<arr.length;i++){
			//为每个数组元素赋值
			arr[i]=i+2;
			//打印遍历数组
			System.out.println("arr["+i+"]："+arr[i]);
		}
		
		

	}

}
