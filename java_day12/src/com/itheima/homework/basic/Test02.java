package com.itheima.homework.basic;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

/*
 * 三、需求说明：自定义一个学生类，给出成员变量name和age，
 * 创建HashMap集合键是String，代表学号，值是自定义学生对象，
 * 代表每一个学生，给集合中添加一些元素，并使用两种方式遍历HashMap集合。
 */
public class Test02 {

	public static void main(String[] args) {
		//定义集合对象
		HashMap<String,Student> hs = new HashMap<String,Student>();
		
		//创建元素对象
		Student s1 = new Student("xxx1",25);
		Student s2 = new Student("xxx2",15);
		Student s3 = new Student("xxx3",35);
		
		hs.put("001", s1);
		hs.put("002", s2);
		hs.put("003", s3);
		
		//遍历通过键值获得值
		Set<String> keySet = hs.keySet();
		for (String key : keySet) {
			Student st = hs.get(key);
			
			System.out.println(key+"---"+st.getName()+"---"+st.getAge());
		}
		
		
		System.out.println("--------------------------------");
		//通过键值对对象获取
		Set<Entry<String, Student>> entrySet = hs.entrySet();
		for (Entry<String, Student> entry : entrySet) {
			String key = entry.getKey();
			
			Student st = entry.getValue();
			
			System.out.println(key+"---"+st.getName()+"---"+st.getAge());
		}
		

	}

}
