package com.itheima.myCollections_iterator02;

/*
 * ����:��ȡһ��Collection���϶���,���Ԫ�ز�����
	����:
	��һ��:����Collection���϶���
	�ڶ���:����ΪString����
	������:���Ԫ��
	���Ĳ�:ͨ�����������б���
	���岽:��ӡ������ÿһ��Ԫ��

 */
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class IteratorDemo3 {

	public static void main(String[] args) {
		// �������϶���
		Collection<Student> c = new ArrayList<Student>();

		//����Ԫ�ض���
		Student s1 = new Student("˾��ܲ", 30);
		Student s2 = new Student("�����", 35);
		Student s3 = new Student("��ά", 28);

		// ��Ӷ���
		c.add(s1);
		c.add(s2);
		c.add(s3);

		// ������������
		Iterator<Student> it = c.iterator();

		while (it.hasNext()) {
			Student s = it.next();
			System.out.println(s);
		}

	}

}
