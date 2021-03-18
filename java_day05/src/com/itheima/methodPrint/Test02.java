package com.itheima.methodPrint;

import java.util.Random;
import java.util.Scanner;

import javax.naming.ldap.Rdn;

/*
	定义数组int arr = {1,2,3,4,5,6}
	定义一个方法打印数组的内容
	要求：
	1.确定方法的参数列表
	2.确定方法的返回值类型
	3.打印结果为 [1,2,3,4,5,6]

 *  
 */
public class Test02 {
	public static void main(String[] args) {
	   Random rd = new Random();
	   int[] arr = new int[6];
	   
	   for(int i=0;i<arr.length;i++){
		   arr[i] = rd.nextInt(6)+1;
	   }
	   
	   //调用打印方法
	   printArray(arr);
	}
	
	/*
	 * 定义一个方法打印数组的内容
	 */
    public static void printArray(int[] arr){
    	System.out.print("[");
    	for (int i = 0; i < arr.length; i++) {
    		//判断是否为最后一个数组元素
			if(i==arr.length-1){
				System.out.print(arr[i]);
			}else{
				System.out.print(arr[i]+", ");
			}
			
		}
    	System.out.println("]");
    }
	

}
