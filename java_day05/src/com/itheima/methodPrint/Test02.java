package com.itheima.methodPrint;

import java.util.Random;
import java.util.Scanner;

import javax.naming.ldap.Rdn;

/*
	��������int arr = {1,2,3,4,5,6}
	����һ��������ӡ���������
	Ҫ��
	1.ȷ�������Ĳ����б�
	2.ȷ�������ķ���ֵ����
	3.��ӡ���Ϊ [1,2,3,4,5,6]

 *  
 */
public class Test02 {
	public static void main(String[] args) {
	   Random rd = new Random();
	   int[] arr = new int[6];
	   
	   for(int i=0;i<arr.length;i++){
		   arr[i] = rd.nextInt(6)+1;
	   }
	   
	   //���ô�ӡ����
	   printArray(arr);
	}
	
	/*
	 * ����һ��������ӡ���������
	 */
    public static void printArray(int[] arr){
    	System.out.print("[");
    	for (int i = 0; i < arr.length; i++) {
    		//�ж��Ƿ�Ϊ���һ������Ԫ��
			if(i==arr.length-1){
				System.out.print(arr[i]);
			}else{
				System.out.print(arr[i]+", ");
			}
			
		}
    	System.out.println("]");
    }
	

}
