package com.itheima.homework.basic;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

/*
 * һ������˵�����Զ���һ��ѧ���࣬������Ա����name��age��
 * ����HashMap���ϼ����Զ���ѧ�����󣬴���ÿһ��ѧ����
 * ֵ��String������ѧ����ַ�������������һЩԪ�أ�
 * ��ʹ�����ַ�ʽ����HashMap���ϡ����ѧ������ĳ�Ա����ֵ��ͬ����˵����ͬһ������
 */
public class Test03 {

	public static void main(String[] args) {
		// �������϶���
		HashMap<Student,String> hs = new HashMap<Student,String>();
		
		//����Ԫ�ض���
		Student s1 = new Student("xxx1",12);
		Student s2 = new Student("xxx1",42);
		Student s3 = new Student("xxx1",22);
		
		hs.put(s1, "����");
		hs.put(s2, "�Ϻ�");
		hs.put(s3, "����");
		
		//ʹ��for��ǿ����
		Set<Student> keySet = hs.keySet();
		 for (Student stu : keySet) {
			String str = hs.get(stu);
			System.out.println(stu.getName()+"---"+stu.getAge()+"==="+str);
		}
		 
		 
		 System.out.println("---------------------------------------------");
		//ͨ����ֵ�Զ���ʽ����
		 Set<Entry<Student,String>> entrySet = hs.entrySet();
		 for(Entry<Student,String> en : entrySet){
			 Student stu = en.getKey();
			 
			 String str = en.getValue();
			 
			 System.out.println(stu.getName()+"---"+stu.getAge()+"==="+str);
		 }
		 
		
		

	}

}
