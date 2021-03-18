package com.itheima.homework.basic;
/*
 * 
 */
public class Test01 {

	public static void main(String[] args) {
		int sum = 0;
		for(int i=1;i<=100;i++){
			if(i%2!=0){
				sum += i;
			}
		}
		System.out.println("1-100的奇数和为："+sum);

	}

}
