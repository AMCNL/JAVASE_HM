package com.itheima.myCollections_01review;

import java.util.ArrayList;
import java.util.Collection;

/*
	����:��ȡCollection����,�����Ԫ��
	����:
	��һ��:��ȡCollection���϶���,��ȷ������ 
	�ڶ���:���Ԫ��
	������:��ӡ���϶���

 */
public class CollectionTest1 {

	public static void main(String[] args) {
		// �������϶�������ӿڣ�List����ʵ���ࣨArrayList����
		Collection<String> c = new ArrayList<String>();
		
		//���Ԫ��
		c.add("hello");
		c.add("world");
		c.add("java");
		
		//��ӡ���
		System.out.println(c);
		

	}

}
