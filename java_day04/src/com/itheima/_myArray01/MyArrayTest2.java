package com.itheima._myArray01;
/*
 * ʹ��ѭ����ֵ���������
 */
public class MyArrayTest2 {
	public static void main(String[] args) {
		//����int���͵����飬����Ϊ8
        int [] arr = new int[8];
        
       /* arr[0] = 2;
        arr[1] = 4;
        arr[2] = 6;
        arr[3] = 8;
        arr[4] = 10;
        arr[5] = 12;
        arr[6] = 14;*/
        //����һ��������ʼ��Ϊ0
        int inti=0;
        //ѭ����ֵ
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
        //ѭ����ӡ
        for(int i=0;i<=7;i++){
        	System.out.println("arr["+i+"]"+arr[i]);
        }
       
	}
}
