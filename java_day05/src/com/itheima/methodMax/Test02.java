package com.itheima.methodMax;

import java.util.Scanner;

/*
 * ����һ��������ȡ���������еĽϴ�ֵ
Ҫ��1.��ע����д������
          2.��ע������ȷ����ֵ������ʲô
          3.��ע������ȷ�����б���ʲô

���ø÷������ؽ������ӡ���
Ҫ��1.ʹ�ü���¼������int����Ϊ���������÷�	     ��ʱ����
	   2.ʹ��int���ͽ��ս��������ӡ������
 */
public class Test02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�������һ��ֵ��");
		int x = sc.nextInt();
		
		System.out.println("������ڶ���ֵ��");
		int y = sc.nextInt();
		
		System.out.println("�����������ֵ��");
		int z = sc.nextInt();
		
		int max = getMax(x, y,z);
		System.out.println("max:"+max);
	}
	/*
	 * ����ֵ���ͣ�int
	 * �����б�int a,int b
	 */
	public static int getMax(int a,int b,int c){
		int max=0;
		
		if(a>b){
			max = a;
			
		}else{
			max = b;
		}
		
		if(c>max){
			max = c;
		}
		
		//��Ԫ
		int max1=(a>b)?(a>c?a:c):(b>c?b:c);
		
		//return max;
		return max1;
	}

}
