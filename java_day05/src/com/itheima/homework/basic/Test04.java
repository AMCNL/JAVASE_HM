package com.itheima.homework.basic;

import java.util.Scanner;

/*
	�ж���һ������,���Խ���һ������,
	���Ϊ[90,100][������������䣬��Ҫ����һ��[],()]�����Χ�������ء�A��
	���Ϊ[80,90)�����Χ�������ء�B��
	���Ϊ[70,80)�����Χ�������ء�C��
	���Ϊ[60,70)�����Χ�������ء�D��
	���Ϊ[0,60)�����Χ�������ء�E��
	�����������Ϸ�Χ�ķ��ء�F��
 */
public class Test04 {

	public static void main(String[] args) {
     
		Scanner sc = new Scanner(System.in);
		System.out.println("������һ��ֵ��");
		int num = sc.nextInt();
		
		//���÷��������ݲ���
		char c=show(num);
		
		System.out.println(c);
		
		
	}
	
	/*
	 * �ж���һ������,���Խ���һ������,
	 * ����ֵ���ͣ�char
	 * �����б�int n
	 */
	public static char show(int n){
		if(n>=90 &&n<=100){
			return 'A';
		}else if(n>=80 && n<90){
			return 'B';
		}else if(n>=70 && n<80){
			return 'C';
		}else if(n>=60 && n<70){
			return 'D';
		}else if(n>=0 && n<60){
			return 'E';
		}else{
			return 'F';
		}
	}

}
