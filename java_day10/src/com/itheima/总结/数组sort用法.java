package com.itheima.�ܽ�;

import java.util.Arrays;

public class ����sort�÷� {

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
