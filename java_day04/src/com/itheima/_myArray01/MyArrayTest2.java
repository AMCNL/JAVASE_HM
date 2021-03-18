package com.itheima._myArray01;
/*
 * 使用循环赋值和输出数组
 */
public class MyArrayTest2 {
	public static void main(String[] args) {
		//定义int类型的数组，长度为8
        int [] arr = new int[8];
        
       /* arr[0] = 2;
        arr[1] = 4;
        arr[2] = 6;
        arr[3] = 8;
        arr[4] = 10;
        arr[5] = 12;
        arr[6] = 14;*/
        //定义一个变量初始化为0
        int inti=0;
        //循环赋值
        for(int i=0;i<=6;i++){
        	inti+=2;
        	arr[i] = inti;
        }
       
        /*System.out.println("arr[0]:"+arr[0]);
        System.out.println("arr[1]:"+arr[1]);
        System.out.println("arr[2]:"+arr[2]);
        System.out.println("arr[3]:"+arr[3]);
        System.out.println("arr[4]:"+arr[4]);
        System.out.println("arr[5]:"+arr[5]);
        System.out.println("arr[6]:"+arr[6]);
        System.out.println("arr[7]:"+arr[7]);*/
        //循环打印
        for(int i=0;i<=7;i++){
        	System.out.println("arr["+i+"]"+arr[i]);
        }
       
	}
}
