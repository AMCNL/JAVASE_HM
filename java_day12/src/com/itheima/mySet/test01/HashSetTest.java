package com.itheima.mySet.test01;

import java.util.HashSet;
import java.util.Iterator;
/*
 * 需求:HashSet集合存储自定义对象,并遍历
	分析:
	第一步:获取HashSet集合对象
	第二步:自定义一个学生类
	第三步:创建学生类对象,并添加到集合中
	第四步:遍历集合
	第五步:打印元素

 */
public class HashSetTest {

	public static void main(String[] args) {
		//创建集合对象
		HashSet<Student> hs = new HashSet<Student>();
		
		Student s1 = new Student("刘德华",25);
		Student s2 = new Student("成龙",33);
		Student s3 = new Student("张学友",22);
		
		//添加集合元素
		hs.add(s1);
		hs.add(s2);
		hs.add(s3);
		
		//创建迭代对象
		Iterator<Student> it = hs.iterator();
		
		while(it.hasNext()){
			Student s  = it.next();
			System.out.println(s.getName()+"---"+s.getAge());
		}
		
		
		

	}

}
