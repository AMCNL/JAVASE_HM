package com.itheima.myMap.test01_review;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MyMapTest3 {

	public static void main(String[] args) {
		// �������϶���
		Map<String,String> m = new HashMap<String,String>();
		
		m.put("0001", "С��");
		m.put("0002", "С��");
		m.put("0003", "С��");
		
		System.out.println(m.get("0001"));
		
		
		//��ȡ���м�����
		Set<String> s = m.keySet();
		
		for (String key : s) {
			System.out.println(key);
		}
		
		//��ȡ����ֵ����
		/*
		 * ˼����Ϊʲôʹ��Collection���������գ���Ҫ���ǵ����ڵ���չ����ԣ�
		 * ����޶���ĳһ������ӿڣ�����������µ��ӽӿڳ��֣�����ƥ��
		 * �����ö��㼯�Ͻӿں��ڿ���ͨ����̬��ʽʵ��
		 */
		Collection<String> c = m.values();
		for (String v : c) {
			System.out.println(v);
		}
	
	}

}
