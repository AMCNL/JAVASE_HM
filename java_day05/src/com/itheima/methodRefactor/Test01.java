package com.itheima.methodRefactor;
/*
	�������ص���������ʵ�ֱȽ����������Ƿ���ȡ�
	Ҫ��
	1.��һ�������Ĳ�������Ϊ����int����
	2.�ڶ��������Ĳ�������Ϊ����double����
	3.��main�����н��в���

 */
public class Test01 {
	public static void main(String[] args) {
		//���÷�������������int���͵�ֵ
		//boolean b1 = compare(10,10);
		boolean b1 = compare((int)10,(int)10);
		
		System.out.println(b1);
		
		//���÷�������������double���͵�ֵ
		
		boolean b2=compare((double)10.1,(double)10.1);
		System.out.println(b2);
	}
	
	//�Ƚ�int���͵�����ֵ�Ƿ����
	public static boolean compare(int a,int b){
		return a == b;
	}
	
	//�Ƚ�double���͵�����ֵ�Ƿ����
	public static boolean compare(double a,double b){
		return a == b;
	}
	
	
	

}
