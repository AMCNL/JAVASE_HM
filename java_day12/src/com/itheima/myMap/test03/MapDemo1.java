package com.itheima.myMap.test03;

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

		Student s1 = new Student("林青霞",21);
		Student s2 = new Student("张曼玉",31);
		Student s3 = new Student("王祖贤",30);
		
		map.put("it001", s1);
		map.put("it002", s2);
		map.put("it003", s3);

		//第一种遍历方法，获得所有的键，通过键得到值
		Set<String> keySet = map.keySet();
		
		//增强for循环set集合
		for (String key : keySet) {
			
			Student s = map.get(key);
			System.out.println(key+"---"+s.getName()+"---"+s.getAge());
		}
		
		
		System.out.println("--------------------");
		//第二种遍历方法，通过得到键值对集合遍历
		
		Set<Entry<String, Student>> set = map.entrySet();
		
		for (Entry<String, Student> e : set) {
			
			String key = e.getKey();
			
			Student s = e.getValue();
			
			System.out.println(key+"---"+s.getName()+"---"+s.getAge());
		}

	}

}

