package com.itheima.myList_01;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
 * ����List���ϵ���ͨforѭ��
	������
	��һ��:��ȡһ��List����
	�ڶ���:������String
	������:ʹ��List�е�get��size�����Լ��Ͻ��б���
	���Ĳ�:��ӡ����Ԫ��
 */
public class ListTest3 {

	public static void main(String[] args) {
		// �������϶���
		List<String> list = new ArrayList<String>();

		list.add("java");
		list.add("php");
		list.add("ui");

		for (int i = 0; i < list.size(); i++) {
			String s = list.get(i);
			System.out.println(s);
		}
		
		
		System.out.println("---------------------------------");
	
		
		//ʹ�õ��������б���
		Iterator it = list.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
		
		//
	}

}
