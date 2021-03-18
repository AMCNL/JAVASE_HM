package com.itheima._homework.high;

import java.util.Random;

import javax.naming.ldap.Rdn;

/*
	将数字1-10保存到一个长度为10的一维数组中
	定义一个新数组,长度为3,取出原来数组中随机三个元素(不考虑是否重复)
	给新数组的元素赋值
	求新数组所有元素的和
 */
public class Test01 {

	public static void main(String[] args) {
		//长度为10的一维数组中
		int[] arr1 = new int[10];
		
		//为元素赋值
		for(int i=0;i<arr1.length;i++){
			arr1[i] = i+1;
		}
		
		//定义一个新数组,长度为3
		int[] arr2 = new int[3];
		
		Random rd = new Random();
		
		//定义一个sum求和变量
		int sum = 0;
		for (int i = 0; i < arr2.length; i++) {
			arr2[i] = rd.nextInt(10);
			
			//求和
			sum +=arr2[i];
			System.out.println(arr2[i]);
		}
		System.out.println("sum:"+sum);

	}

}
