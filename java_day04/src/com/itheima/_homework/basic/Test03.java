package com.itheima._homework.basic;
/*
		已知数组int[] nums = {5,10,15},,要求创建一个新数组
		1.新数组的长度和已知数组相同
		2.新数组每个元素的值 是已知数组对应位置元素的2倍
		3.在控制台中打印新数组的所有元素
		
		思路：
		1.定义题目要求的已知数组
		2.定义题目要求的新数组
		3.根据条件为新数组中每个元素赋值
		4.遍历新数组打印到控制台中
 */
public class Test03 {

	public static void main(String[] args) {	
		
		//已知数组
		int[] nums = {5,10,15};
		
       //定义一个新数组
		int[] nums1 = new int[3];
		
		//这里使用循环方式
		for(int i=0;i<nums1.length;i++){
			
			//为nums1数组赋值
			nums1[i] = 2*nums[i];
			
			//打印输出
			System.out.println("nums1["+i+"]:"+nums1[i]);
		}
		
	}

}
