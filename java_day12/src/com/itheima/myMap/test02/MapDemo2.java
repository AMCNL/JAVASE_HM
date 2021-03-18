package com.itheima.myMap.test02;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/*
 * map���ϵı���2
 * ˼·��
 *   ͨ����ȡ��ֵ�Լ��ϻ�ȡֵ
 *   
 *   1-��ȡ���еļ�ֵ�Լ���
 *   2-ͨ����ֵ�Լ��ϵķ�����ȡ����ֵ
 *   
 *   map.entrySet();
 *
 */
public class MapDemo2 {

	public static void main(String[] args) {
		// �������϶���
		Map<String, String> map = new HashMap<String, String>();

		map.put("it001", "����ϼ");
		map.put("it002", "������");
		map.put("it003", "������");

		Set<Entry<String, String>> entrySet = map.entrySet();
		
		for (Entry<String, String> e : entrySet) {
			//��ȡ��
			String key = e.getKey();
			//��ȡֵ
			String value = e.getValue();
			
			//���
			System.out.println(key+"-----"+value);
		}

	}

}
