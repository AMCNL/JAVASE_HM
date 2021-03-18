package com.itheima.myMap.myTest01;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

/*
 *ArrayList��Ƕ��hashMap
 */
public class MapDemo1 {

	public static void main(String[] args) {
		// ����ArrayList����
		ArrayList<HashMap<String, String>> array = new ArrayList<HashMap<String, String>>();

		// ����Ԫ�ض���
		HashMap<String, String> hm1 = new HashMap<String, String>();
		hm1.put("˾��ܲ", "�����");
		hm1.put("����", "�ܲ�");

		array.add(hm1);
		// ����Ԫ�ض���
		HashMap<String, String> hm2 = new HashMap<String, String>();
		hm2.put("��ا", "��ֲ");
		hm2.put("˾��ʦ", "˾����");

		array.add(hm2);
		// ����Ԫ�ض���
		HashMap<String, String> hm3 = new HashMap<String, String>();
		hm3.put("��ά", "����");
		hm3.put("�Ǻ�", "����");

		array.add(hm3);

		// ����ArrayList����
		for (HashMap<String, String> hashMap : array) {
			// �õ���ֵ�Լ���
			Set<String> key = hashMap.keySet();

			for (String k : key) {
				String value = hashMap.get(k);

				System.out.println(k + "---" + value);

			}
		System.out.println("----------------");

		}
		
		
		System.out.println("----------------------------------");
		
		//ʹ�ü�ֵ�Զ���
		for (HashMap<String, String> hashMap : array) {
			Set<Entry<String, String>> entrySet = hashMap.entrySet();
			
			for (Entry<String, String> entry : entrySet) {
				String key = entry.getKey();
				
				String value = entry.getValue();
				
				System.out.println(key+"---"+value);
			}
			System.out.println("--------------------");
		}

	}

}
