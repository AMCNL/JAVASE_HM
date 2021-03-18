package com.itheima.homework.basic;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/*
 * һ������˵�����Զ���һ��ѧ���࣬������Ա����name��age��
 * ʹ��HashSet���ϴ洢�Զ�����󲢱������������ϵ�ʱ��
 * �ڿ���̨���ѧ������ĳ�Ա����ֵ��Ҫ��ʹ�����ַ�ʽ���б���(����������ǿfor)��
       �������������ݽ������Ժ���������д洢��ѧ�������������������ͬ��
 * ��Ϊ��ͬһ���ˣ��Ͳ��洢�ڼ����У���������ء�
 */
public class Test01 {

	public static void main(String[] args) {
		// ���弯�϶���
		Set<Student> set = new HashSet<Student>();

		// ����Ԫ�ض���
		Student s1 = new Student("lcn", 12);
		Student s2 = new Student("hg", 15);
		Student s3 = new Student("cg", 16);

		// ��Ҫstudent��дhashcode������equals�������ܱ�֤set����Ψһ��
		Student s4 = new Student("cg", 16);

		set.add(s1);
		set.add(s2);
		set.add(s3);

		// ��Ҫstudent��дhashcode������equals�������ܱ�֤set����Ψһ��
		set.add(s4);

		for (Student student : set) {
			System.out.println(student.getName() + "---" + student.getAge());
		}

		System.out.println("----------------------------------");

		Iterator<Student> it = set.iterator();
		while (it.hasNext()) {
			Student stu = it.next();
			System.out.println(stu.getName() + "---" + stu.getAge());

		}

	}

}
