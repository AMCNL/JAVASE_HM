package com.itheima.myMap.test04;

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
		Map<Student, String> map = new HashMap<Student, String>();

		Student s1 = new Student("林青霞",21);
		Student s2 = new Student("张曼玉",31);
		Student s3 = new Student("王祖贤",30);
		
		map.put(s1, "北京");
		map.put(s2, "洛阳");
		map.put(s3, "广州");

		//第一种遍历方法，获得所有的键，通过键得到值
		Set<Student> keySet = map.keySet();
		
		//增强for循环set集合
		for (Student key : keySet) {
			
			String s = map.get(key);
			System.out.println(key.getName()+"---"+key.getAge()+"----"+"---"+s);
		}
		
		
		
		
		
		
		
		System.out.println("--------------------");
		
		
		
		
		
		
		
		/*//第二种遍历方法，通过得到键值对集合遍历
		
		Set<Entry<String, Student>> set = map.entrySet();
		
		for (Entry<String, Student> e : set) {
			
			String key = e.getKey();
			
			Student s = e.getValue();
			
			System.out.println(key+"---"+s.getName()+"---"+s.getAge());
		}*/

	}

}

