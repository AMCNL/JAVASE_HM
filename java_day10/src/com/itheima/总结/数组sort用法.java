package com.itheima.总结;

import java.util.Arrays;

public class 数组sort用法 {

	public static void main(String[] args) {
		int[] arr = {5,6,9,8,10,3};
		
		Arrays.sort(arr);
		
		System.out.print("[");
		for (int i = 0; i < arr.length; i++) {
			if(i == arr.length-1){
				System.out.print(arr[i]);
			}else{
				System.out.print(arr[i]+", ");
				
			}
		}
		System.out.print("]");

	}

}
