package com.itheima.myList_01;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
 * ����:��ϰList�����еĹ���
	void add(int index,E element):��ָ��λ�����Ԫ��
	E remove(int index):ɾ��ָ��λ�õ�Ԫ��
	E get(int index):��ȡָ��λ�õ�Ԫ��
	E set(int index,E element):�޸�ָ��λ�õ�Ԫ��

 */
public class ListTest2 {

	public static void main(String[] args) {
		// �������϶���
		List<String> list = new ArrayList<String>();

		list.add("java");
		list.add("php");
		list.add("ui");

		// List�ӿ����з���
		list.add(1, "haha");

		System.out.println(list);

		System.out.println("-----------------------");

		// remove()
		System.out.println("remove:" + list.remove(1));
		System.out.println(list);

		System.out.println("-----------------------");

		// set()

		list.set(1, "�Ǻ�");

		System.out.println(list);

		System.out.println("-----------------------");

		// get()

		System.out.println(list.get(1));
		//java.lang.IndexOutOfBoundsException

		
		//java.lang.IndexOutOfBoundsException
		//System.out.println(list.get(15));����
	}

}
