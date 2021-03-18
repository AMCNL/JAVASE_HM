package com.itheima.myList_Test2;

import java.util.Iterator;
import java.util.LinkedList;

/*
 * 需求：List集合存储自定义对象并遍历
	分析：
	第一步:自定义一个学生类，给出成员变量name和age。
	第二步:获取List集合对象,泛型是学生类
	第三步:创建学生对象,并存储到集合对象中
	第四步:使用迭代器,普通for，增强for遍历集合
	第五步:打印集合元素

 */
public class IteratorTest {

	public static void main(String[] args) {
		// 创建集合对象
		LinkedList<Student> list = new LinkedList<Student>();

		// 创建元素对象
		Student s1 = new Student("黄家驹", 100);
		Student s2 = new Student("黄家强", 99);
		Student s3 = new Student("黄贯中", 98);
		Student s4 = new Student("叶世荣", 97);

		list.add(s1);
		list.add(s2);
		list.add(s3);
		list.add(s4);

		// 创建迭代对象
		Iterator<Student> it = list.iterator();

		while (it.hasNext()) {
			Student s = it.next();
			System.out.println(s);
		}

		System.out.println("--------普通for-------------------");

		// 普通for
		for (int i = 0; i < list.size(); i++) {

			Student s = list.get(i);
			System.out.println(s.getName() + "---" + s.getAge());
		}
		
		
		System.out.println("--------------增强for遍历---------");
		//增强for遍历
		for (Student student : list) {
			System.out.println(student.getName()+"---"+student.getAge());
		}

	}

}
