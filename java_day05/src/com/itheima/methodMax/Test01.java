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
public class Test01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�������һ��ֵ��");
		int x = sc.nextInt();
		
		System.out.println("������ڶ���ֵ��");
		int y = sc.nextInt();
		
		int max = getMax(x, y);
		System.out.println("max:"+max);
	}
	/*
	 * ����ֵ���ͣ�int
	 * �����б�int a,int b
	 */
	public static int getMax(int a,int b){
		
		if(a>b){
			return a;
		}else{
			return b;
		}
	}

}
