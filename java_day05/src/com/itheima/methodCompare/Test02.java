package com.itheima.methodCompare;

import java.util.Scanner;

/*
 *   ����һ�������ж����������Ƿ����
Ҫ��1.��ע����д������
          2.��ע������ȷ����ֵ������ʲô
          3.��ע������ȷ�����б���ʲô

���ø÷������ؽ������ӡ���
Ҫ��1.ʹ�ü���¼������int����Ϊ���������÷�	     ��ʱ����
	   2.��ӡ������
 */
public class Test02 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("�������һ������");
		int x = sc.nextInt();
		System.out.println("������ڶ�������");
		int y = sc.nextInt();
		System.out.println("���������������");
		int z = sc.nextInt();
		boolean flag = compare(x, y,z);
		System.out.println("flag:" + flag);

	}

	/*
	 * ����ֵ���ͣ�boolean �����б�int a,int b
	 */
	public static boolean compare(int a, int b,int c) {
		if (a == b && b== c) {
			return true;
		} else {
			return false;
		}
        
		//��Ԫ
		// return a==b?true:false;
		
		//һ��㶨
		// return a==b;
	}
}
