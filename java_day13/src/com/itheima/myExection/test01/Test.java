package com.itheima.myExection.test01;
/*
 * ����: ��дһ�δ���, Ҫ������л��������Խ���쳣		��ʹ��try...catch���д���
	����:
	��һ��:��������
	�ڶ���:�ڴ�ӡ����з��ʲ����ڵ�����
	������:�����ܷ�������Ĵ�����try����
	���Ĳ�:catch�в���IndexOutOfBoundsException
	���岽:���쳣���д���,����printStackTrace��ӡ���쳣��Ϣ

 */
public class Test {
	public static void main(String[] args) {
		//��һ��:��������
		int[] arr = {1,2,3,4,5};
		
		
		//������:�����ܷ�������Ĵ�����try����
		try {
			//�ڶ���:�ڴ�ӡ����з��ʲ����ڵ�����
			System.out.println(arr[10]);
		} catch (ArrayIndexOutOfBoundsException e) {//���Ĳ�:catch�в���IndexOutOfBoundsException
			
			e.printStackTrace();
		}
		
	}

}
