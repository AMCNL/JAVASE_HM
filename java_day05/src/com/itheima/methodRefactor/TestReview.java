package com.itheima.methodRefactor;

/*
	�������ص���������ʵ�ֱȽ����������Ƿ���ȡ�
	Ҫ��
	1.��һ�������Ĳ�������Ϊ����int����
	2.�ڶ��������Ĳ�������Ϊ����double����
	3.��main�����н��в���

 */
public class TestReview {
	public static void main(String[] args) {

		//boolean flag1 = compare(10,10);
		boolean flag1 = compare((int) 10, (int) 10);
		System.out.println(flag1);
		
		
		//boolean flag2 = compare(10.1,10.2);
		boolean flag2 = compare((double) 10.1, (double) 10.2);
		System.out.println(flag2);

	}

	// �Ƚ�����int ���͵�ֵ�Ƿ����
	public static boolean compare(int a, int b) {
		return a == b;
	}

	// �Ƚ�����double���͵�ֵ�Ƿ����
	public static boolean compare(double a, double b) {
		return a == b;
	}

}
