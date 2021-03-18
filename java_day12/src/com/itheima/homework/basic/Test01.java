package com.itheima.homework.basic;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/*
 * 一、需求说明：自定义一个学生类，给出成员变量name和age，
 * 使用HashSet集合存储自定义对象并遍历，遍历集合的时候，
 * 在控制台输出学生对象的成员变量值。要求使用两种方式进行遍历(迭代器、增强for)。
       二、当上述内容解决完毕以后，如果集合中存储的学生对象，年龄和姓名都相同，
 * 认为是同一个人，就不存储在集合中，该如何做呢。
 */
public class Test01 {

	public static void main(String[] args) {
		// 定义集合对象
		Set<Student> set = new HashSet<Student>();

		// 定义元素对象
		Student s1 = new Student("lcn", 12);
		Student s2 = new Student("hg", 15);
		Student s3 = new Student("cg", 16);

		// 需要student重写hashcode方法和equals方法才能保证set集合唯一性
		Student s4 = new Student("cg", 16);

		set.add(s1);
		set.add(s2);
		set.add(s3);

		// 需要student重写hashcode方法和equals方法才能保证set集合唯一性
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
