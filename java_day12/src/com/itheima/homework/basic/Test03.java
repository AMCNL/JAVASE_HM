package com.itheima.homework.basic;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

/*
 * 一、需求说明：自定义一个学生类，给出成员变量name和age，
 * 创建HashMap集合键是自定义学生对象，代表每一个学生，
 * 值是String，代表学生地址，给集合中添加一些元素，
 * 并使用两种方式遍历HashMap集合。如果学生对象的成员变量值相同，就说明是同一个键。
 */
public class Test03 {

	public static void main(String[] args) {
		// 创建集合对象
		HashMap<Student,String> hs = new HashMap<Student,String>();
		
		//创建元素对象
		Student s1 = new Student("xxx1",12);
		Student s2 = new Student("xxx1",42);
		Student s3 = new Student("xxx1",22);
		
		hs.put(s1, "北京");
		hs.put(s2, "上海");
		hs.put(s3, "广州");
		
		//使用for增强遍历
		Set<Student> keySet = hs.keySet();
		 for (Student stu : keySet) {
			String str = hs.get(stu);
			System.out.println(stu.getName()+"---"+stu.getAge()+"==="+str);
		}
		 
		 
		 System.out.println("---------------------------------------------");
		//通过键值对对象方式遍历
		 Set<Entry<Student,String>> entrySet = hs.entrySet();
		 for(Entry<Student,String> en : entrySet){
			 Student stu = en.getKey();
			 
			 String str = en.getValue();
			 
			 System.out.println(stu.getName()+"---"+stu.getAge()+"==="+str);
		 }
		 
		
		

	}

}
