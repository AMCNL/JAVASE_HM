package com.itheima.mySet.test01_review;

import java.util.HashSet;
import java.util.Iterator;

public class MySetTest {
	public static void main(String[] args) {
		//�������϶���
		HashSet<Student> hs = new HashSet<Student>();
		
		//����Ԫ�ض���
		Student s1 = new Student("����ϼ",33);
		Student s2 = new Student("������",30);
		Student s3 = new Student("������",35);
		
		//��Ӽ���Ԫ��
		hs.add(s1);
		hs.add(s2);
		hs.add(s3);
		
		
		
		Iterator<Student> it = hs.iterator();
		while(it.hasNext()){
			Student s = it.next();
			System.out.println(s.getName()+"---"+s.getAge());
		}
		
		
		System.out.println("-----------------------------");
		
		for (Student stu : hs) {
			System.out.println(stu.getName()+"***"+stu.getAge());
		}
		
	}

}
