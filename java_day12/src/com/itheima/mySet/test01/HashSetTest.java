package com.itheima.mySet.test01;

import java.util.HashSet;
import java.util.Iterator;
/*
 * ����:HashSet���ϴ洢�Զ������,������
	����:
	��һ��:��ȡHashSet���϶���
	�ڶ���:�Զ���һ��ѧ����
	������:����ѧ�������,����ӵ�������
	���Ĳ�:��������
	���岽:��ӡԪ��

 */
public class HashSetTest {

	public static void main(String[] args) {
		//�������϶���
		HashSet<Student> hs = new HashSet<Student>();
		
		Student s1 = new Student("���»�",25);
		Student s2 = new Student("����",33);
		Student s3 = new Student("��ѧ��",22);
		
		//��Ӽ���Ԫ��
		hs.add(s1);
		hs.add(s2);
		hs.add(s3);
		
		//������������
		Iterator<Student> it = hs.iterator();
		
		while(it.hasNext()){
			Student s  = it.next();
			System.out.println(s.getName()+"---"+s.getAge());
		}
		
		
		

	}

}
