package com.itheima.myMap.test02_review;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
 * map���ϵı���
 *    ˼·�����ȵõ����еļ�����
 *         �������еļ���ͨ��get(key)�õ���Ӧ��valueֵ
 */
public class MapDemo1 {

	public static void main(String[] args) {
		// �������϶���
		Map<String, String> map = new HashMap<String, String>();

		map.put("it001", "����ϼ");
		map.put("it002", "������");
		map.put("it003", "������");

		//��ȡ���м�ֵ
		Set<String> set = map.keySet();
		
		for (String key : set) {
			
			//ͨ������ȡֵ
			String v = map.get(key);
			
			System.out.println(key+"---"+v);
		}

	}

}
