package com.itheima.myMap.test04_review;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/*
 *
 */
public class MapDemo1 {

	public static void main(String[] args) {
		//创建集合对象
		HashMap<Student,String> hm = new HashMap<Student,String>();

		//创建元素对象
		Student s1 = new Student("刘德华",10);
		Student s2 = new Student("成龙",15);
		Student s3 = new Student("黎明",18);
		
		Student s4 = new Student("刘德华",10);
		
		hm.put(s1,"广州");
		hm.put(s2,"北京");
		hm.put(s3,"上海");
		
		hm.put(s4,"香港");
		
		//通过键获得值
		Set<Student> set = hm.keySet();
		
		for (Student stu : set) {
			String add = hm.get(stu);
			
			System.out.println(stu+"---"+add);
		}
		
		System.out.println("---------------------------");
	
		//通过键值对方法
		
		Set<Entry<Student, String>> entrySet = hm.entrySet();
		
		for (Entry<Student, String> entry : entrySet) {
			Student stu = entry.getKey();
			
			String address = entry.getValue();
			
			System.out.println(stu+"----"+address);
		}
	}

}

