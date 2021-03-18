package com.itheima.homework.basic;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

/*
 * ��������˵�����Զ���һ��ѧ���࣬������Ա����name��age��
 * ����HashMap���ϼ���String������ѧ�ţ�ֵ���Զ���ѧ������
 * ����ÿһ��ѧ���������������һЩԪ�أ���ʹ�����ַ�ʽ����HashMap���ϡ�
 */
public class Test02 {

	public static void main(String[] args) {
		//���弯�϶���
		HashMap<String,Student> hs = new HashMap<String,Student>();
		
		//����Ԫ�ض���
		Student s1 = new Student("xxx1",25);
		Student s2 = new Student("xxx2",15);
		Student s3 = new Student("xxx3",35);
		
		hs.put("001", s1);
		hs.put("002", s2);
		hs.put("003", s3);
		
		//����ͨ����ֵ���ֵ
		Set<String> keySet = hs.keySet();
		for (String key : keySet) {
			Student st = hs.get(key);
			
			System.out.println(key+"---"+st.getName()+"---"+st.getAge());
		}
		
		
		System.out.println("--------------------------------");
		//ͨ����ֵ�Զ����ȡ
		Set<Entry<String, Student>> entrySet = hs.entrySet();
		for (Entry<String, Student> entry : entrySet) {
			String key = entry.getKey();
			
			Student st = entry.getValue();
			
			System.out.println(key+"---"+st.getName()+"---"+st.getAge());
		}
		

	}

}
