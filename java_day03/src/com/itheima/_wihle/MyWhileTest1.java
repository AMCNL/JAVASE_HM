package com.itheima._wihle;
/*
 * 使用while循环求出1-100的偶数和
 */
public class MyWhileTest1 {

	public static void main(String[] args) {
		int sum = 0;
		int i=1;
		while(i<=100){
			if(i%2 == 0){
				sum+=i;
			}
			i++;
		}
		System.out.println("1-100的偶数和为："+sum);

	}

}
