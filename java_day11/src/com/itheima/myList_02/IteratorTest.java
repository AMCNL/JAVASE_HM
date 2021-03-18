package com.itheima.myList_02;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/*
 * ����List���ϴ洢�Զ�����󲢱���
	������
	��һ��:�Զ���һ��ѧ���࣬������Ա����name��age��
	�ڶ���:��ȡList���϶���,������ѧ����
	������:����ѧ������,���洢�����϶�����
	���Ĳ�:ʹ�õ�������������
	���岽:��ӡ����Ԫ��

 */
public class IteratorTest {

	public static void main(String[] args) {
		// �������϶���
		List<Student> list = new ArrayList<Student>();

		// ����Ԫ�ض���
		Student s1 = new Student("�ƼҾ�", 100);
		Student s2 = new Student("�Ƽ�ǿ", 99);
		Student s3 = new Student("�ƹ���", 98);
		Student s4 = new Student("Ҷ����", 97);

		list.add(s1);
		list.add(s2);
		list.add(s3);
		list.add(s4);

		// ������������
		Iterator<Student> it = list.iterator();

		while (it.hasNext()) {
			Student s = it.next();
			System.out.println(s);
		}

		System.out.println("----------------------");

		// ��ͨfor
		for (int i = 0; i < list.size(); i++) {

			Student s = list.get(i);
			System.out.println(s.getName() + "---" + s.getAge());
		}

	}

}
