package com.itheima._homework.high;

import java.util.Random;

/*
 * 定义长度为10的int数组,数组中的10个元素为随机生成的1-100的数字
 * 要求:按格式打印数组中的元素内容
举例:
	数组原内容:{1,2,3,4,5}
	打印的内容:[1, 2, 3, 4, 5]
 */
public class Test06 {

	public static void main(String[] args) {
		//定义长度为10的int数组
		int[] arr = new int[10];
		
		//创建随机对象
		Random rd = new Random();
		
		//通过循环给元素赋值
		for (int i = 0; i < arr.length; i++) {
			arr[i] = rd.nextInt(10)+1;
			
			//判断条件，如果是开头的话解决  "["
			if(i==0){
				System.out.print("["+arr[i]+",");
			}else if(i==arr.length-1){//当元素下表为最后一个时解决   " ]  "
				System.out.print(arr[i]+"]");
			}else{
				System.out.print(arr[i]+",");
			}
			
		}
		
	}

}
