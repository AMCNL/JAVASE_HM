package com.itheima.oop_1;
/*
 * ����һ��ѧ����������
 */
public class StudentTest {
	public static void main(String[] args) {
		//����ѧ����Ķ���
		Student stu = new Student();
		
		System.out.println(stu.name);
		System.out.println(stu.sex);
		System.out.println(stu.ID);
		System.out.println(stu.age);
		
		stu.eat();
		stu.sleep();
		stu.study();
		System.out.println("-----------------");
		
		//��ֵ����
		stu.age = 25;
		stu.ID = 1001;
		stu.name  = "С��";
		stu.sex = "��";
		
		System.out.println(stu.name);
		System.out.println(stu.sex);
		System.out.println(stu.ID);
		System.out.println(stu.age);
		
		stu.eat();
		stu.sleep();
		stu.study();
		System.out.println("-----------------");
		
	}

}
