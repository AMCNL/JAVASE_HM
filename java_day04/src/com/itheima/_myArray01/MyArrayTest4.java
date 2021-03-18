package com.itheima._myArray01;
/*
		定义一个数组 ：{171,72,19,16,118,51,210,7,18}
		求出该数组中满足要求的元素和。
		要求：求和的元素的个位和十位不能包含7,并且只能为偶数

 */
public class MyArrayTest4 {

	public static void main(String[] args) {
		
		int[] arr = {171,72,19,16,118,51,210,7,18};	
		//定义求和变量
		
		int sum=0;
		//遍历数组
		for(int i=0;i<arr.length;i++){
			//求个位
			int ge = arr[i]%10;
			//求十位
			int shi = arr[i]/10%10;
			//判断条件
			if(ge!=7 && shi!=7 && arr[i]%2==0){
				sum+=arr[i];
				System.out.println(arr[i]);
			}
		}//for end
		
		System.out.println("求和为："+sum);

	}

}
