package com.itheima.mySet.test02_review;

import java.util.HashSet;
import java.util.Iterator;

public class MySetTest {
	public static void main(String[] args) {
		//创建集合对象
		HashSet<Student> hs = new HashSet<Student>();
		
		//创建元素对象
		Student s1 = new Student("王青霞",33);
		Student s2 = new Student("林曼玉",30);
		Student s3 = new Student("张祖贤",35);
		
		Student s4 = new Student("王青霞",33);
		Student s5 = new Student("林曼玉",30);
		
		//添加集合元素
		hs.add(s1);
		hs.add(s2);
		hs.add(s3);
		
		//重写hashcode和equals方法后下面就不会添加（set保证元素唯一）
		hs.add(s4);
		hs.add(s5);
		
		
		
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
