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
		// �������϶���
		Map<Student, String> map = new HashMap<Student, String>();

		Student s1 = new Student("����ϼ",21);
		Student s2 = new Student("������",31);
		Student s3 = new Student("������",30);
		
		map.put(s1, "����");
		map.put(s2, "����");
		map.put(s3, "����");

		//��һ�ֱ���������������еļ���ͨ�����õ�ֵ
		Set<Student> keySet = map.keySet();
		
		//��ǿforѭ��set����
		for (Student key : keySet) {
			
			String s = map.get(key);
			System.out.println(key.getName()+"---"+key.getAge()+"----"+"---"+s);
		}
		
		
		
		
		
		
		
		System.out.println("--------------------");
		
		
		
		
		
		
		
		/*//�ڶ��ֱ���������ͨ���õ���ֵ�Լ��ϱ���
		
		Set<Entry<String, Student>> set = map.entrySet();
		
		for (Entry<String, Student> e : set) {
			
			String key = e.getKey();
			
			Student s = e.getValue();
			
			System.out.println(key+"---"+s.getName()+"---"+s.getAge());
		}*/

	}

}

