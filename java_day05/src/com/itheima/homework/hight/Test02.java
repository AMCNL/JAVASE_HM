package com.itheima.homework.hight;

/*
 * �����������󣬲��ô���ʵ��
	1.����¼�볤���εĳ��Ϳ�
		���巽������ó����ε��ܳ�,����main�����д�ӡ�ܳ�
	2.����¼�볤���εĳ��Ϳ�
		���巽������ó����ε����,����main�����д�ӡ���
	3.����¼��Բ�İ뾶
		���巽�������Բ���ܳ�,����main�����д�ӡ�ܳ�
	4.����¼��Բ�İ뾶
		���巽�������Բ�����,����main�����д�ӡ���
 */
public class Test02 {

	public static void main(String[] args) {
		
		double squarePer=squarePer(10,20);
		System.out.println("�����ε��ܳ�Ϊ��"+squarePer);
		
		double squareArea=squareArea(10,20);
		System.out.println("�����ε����Ϊ��"+squareArea);
		
		double criclePer=criclePer(10);
		System.out.println("Բ���ܳ�Ϊ��"+criclePer);
		
		double cricleArea=cricleArea(10);
		System.out.println("Բ�����Ϊ��"+cricleArea);
		
		
		
	}
	
	/*
	 * ���㳤���ε��ܳ�
	 * ����ֵ���ͣ�double
	 * �����б�int a,int b
	 */
	public static double squarePer(int width,int hight){
		return (width+hight)*2;
	}
	
	/*
	 * ���㳤���ε����
	 * ����ֵ���ͣ�double
	 * �����б�int a,int b
	 */
	public static double squareArea(int width,int hight){
		return width*hight;
	}
	/*
	 * ����Բ���ܳ�
	 * ����ֵ���ͣ�double
	 * �����б�int R
	 */
	public static double criclePer(int R){
		return 2*3.14*R;
	}
	/*
	 * ����Բ�����
	 * ����ֵ���ͣ�double
	 * �����б�int R
	 */
	public static double cricleArea(int R){
		return 3.14*R*R;
	}
}
