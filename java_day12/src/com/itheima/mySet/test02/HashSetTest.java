package com.itheima.mySet.test02;

import java.util.HashSet;
import java.util.Iterator;
/*
 * ����:HashSet���ϴ洢�Զ������,������
     Ҫ��:
        �������ĳ�Ա����ֵ��ͬ������Ϊ��ͬһ��Ԫ��
	����:
	��һ��:��ȡHashSet���϶���
	�ڶ���:�Զ���һ��ѧ����
	������:����ѧ�������,����ӵ�������
	���Ĳ�:��������
	���岽:��ӡԪ��

ע�⣺����������дhashcode������equals����
 */
public class HashSetTest {

	public static void main(String[] args) {
		//�������϶���
		HashSet<Student> hs = new HashSet<Student>();
		
		Student s1 = new Student("���»�",25);
		Student s2 = new Student("����",33);
		Student s3 = new Student("��ѧ��",22);
		
		//���student���в���дhashcode��equals���������������ǻ��ڿ���̨��ӡ�����ģ�
		//������д�˾Ͳ��ᣬ��Ϊ������set����Ψһ�Ե�����
		Student s4 = new Student("���»�",25);
		Student s5 = new Student("����",33);
		
		//��Ӽ���Ԫ��
		hs.add(s1);
		hs.add(s2);
		hs.add(s3);
		
		
		//���student���в���дhashcode��equals�������������ᱻ��ӵ������еģ�
		//������д�˾Ͳ��ᣬ��Ϊ������set����Ψһ�Ե�����
		hs.add(s4);
		hs.add(s5);
		
		
		//������������
		Iterator<Student> it = hs.iterator();
		
		while(it.hasNext()){
			Student s  = it.next();
			System.out.println(s.getName()+"---"+s.getAge());
		}
		
		
		

	}

}
