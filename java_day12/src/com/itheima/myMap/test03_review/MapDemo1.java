package com.itheima.myMap.test03_review;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/*
 *
 */
public class MapDemo1 {

	public static void main(String[] args) {
		// 创建集合对象
		Map<String, Student> map = new HashMap<String, Student>();

		Student s1 = new Student("林青霞", 21);
		Student s2 = new Student("张曼玉", 31);
		Student s3 = new Student("王祖贤", 30);

		map.put("it001", s1);
		map.put("it002", s2);
		map.put("it003", s3);

		// 通过键得到值
		Set<String> set = map.keySet();

		for (String key : set) {
			Student stu = map.get(key);

			System.out.println(key + "---" + stu.getName() + "---" + stu.getAge());
		}

		System.out.println("--------------------------------");
		
		// 通过键值对对象得到值
		Set<Entry<String, Student>> entrySet = map.entrySet();

		for (Entry<String, Student> entry : entrySet) {
			String key = entry.getKey();

			Student stu = entry.getValue();

			System.out.println(key + "---" + stu.getName() + "---" + stu.getAge());
		}
	}

}
