package com.itheima._homework.basic;
/*
		��֪����int[] nums = {5,10,15},,Ҫ�󴴽�һ��������
		1.������ĳ��Ⱥ���֪������ͬ
		2.������ÿ��Ԫ�ص�ֵ ����֪�����Ӧλ��Ԫ�ص�2��
		3.�ڿ���̨�д�ӡ�����������Ԫ��
		
		˼·��
		1.������ĿҪ�����֪����
		2.������ĿҪ���������
		3.��������Ϊ��������ÿ��Ԫ�ظ�ֵ
		4.�����������ӡ������̨��
 */
public class Test03 {

	public static void main(String[] args) {	
		
		//��֪����
		int[] nums = {5,10,15};
		
       //����һ��������
		int[] nums1 = new int[3];
		
		//����ʹ��ѭ����ʽ
		for(int i=0;i<nums1.length;i++){
			
			//Ϊnums1���鸳ֵ
			nums1[i] = 2*nums[i];
			
			//��ӡ���
			System.out.println("nums1["+i+"]:"+nums1[i]);
		}
		
	}

}
