package com.itheima._myArray01;
/*
		定义一个数组 ：{171,72,19,16,118,51,210,7,18}
		求出该数组中满足要求的元素和。
		要求：求和的元素的个位和十位不能包含7,并且只能为偶数

 */
public class MyArrayTest4_2 {

	public static void main(String[] args) {
		//定义一个数组
		int[] arr = {171,72,19,16,118,51,210,7,18};
		//定义一个求和变量sum
		int sum=0;
		for(int i=0;i<arr.length;i++){
			int ge =arr[i]%10;
			int shi = arr[i]/10%10;
			//条件判断求和的元素的个位和十位不能包含7,并且只能为偶数
			if(ge!=7 && shi!=7 && arr[i]%2==0){
				System.out.println(arr[i]);
				sum += arr[i];
			}
			
		}
		
		System.out.println("求和的值为："+sum);
		
		

	}

}
