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
		//�������϶���
		HashMap<Student,String> hm = new HashMap<Student,String>();

		//����Ԫ�ض���
		Student s1 = new Student("���»�",10);
		Student s2 = new Student("����",15);
		Student s3 = new Student("����",18);
		
		Student s4 = new Student("���»�",10);
		
		hm.put(s1,"����");
		hm.put(s2,"����");
		hm.put(s3,"�Ϻ�");
		
		hm.put(s4,"���");
		
		//ͨ�������ֵ
		Set<Student> set = hm.keySet();
		
		for (Student stu : set) {
			String add = hm.get(stu);
			
			System.out.println(stu+"---"+add);
		}
		
		System.out.println("---------------------------");
	
		//ͨ����ֵ�Է���
		
		Set<Entry<Student, String>> entrySet = hm.entrySet();
		
		for (Entry<Student, String> entry : entrySet) {
			Student stu = entry.getKey();
			
			String address = entry.getValue();
			
			System.out.println(stu+"----"+address);
		}
	}

}

