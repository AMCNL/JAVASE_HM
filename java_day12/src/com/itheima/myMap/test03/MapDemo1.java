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
		// �������϶���
		Map<String, Student> map = new HashMap<String, Student>();

		Student s1 = new Student("����ϼ",21);
		Student s2 = new Student("������",31);
		Student s3 = new Student("������",30);
		
		map.put("it001", s1);
		map.put("it002", s2);
		map.put("it003", s3);

		//��һ�ֱ���������������еļ���ͨ�����õ�ֵ
		Set<String> keySet = map.keySet();
		
		//��ǿforѭ��set����
		for (String key : keySet) {
			
			Student s = map.get(key);
			System.out.println(key+"---"+s.getName()+"---"+s.getAge());
		}
		
		
		System.out.println("--------------------");
		//�ڶ��ֱ���������ͨ���õ���ֵ�Լ��ϱ���
		
		Set<Entry<String, Student>> set = map.entrySet();
		
		for (Entry<String, Student> e : set) {
			
			String key = e.getKey();
			
			Student s = e.getValue();
			
			System.out.println(key+"---"+s.getName()+"---"+s.getAge());
		}

	}

}

