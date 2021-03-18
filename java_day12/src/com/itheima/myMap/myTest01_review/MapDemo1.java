package com.itheima.myMap.myTest01_review;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

/*
 *ArrayList��Ƕ��hashMap
 */
public class MapDemo1 {

	public static void main(String[] args) {
		//�������϶���
		ArrayList<HashMap<String,String>>  array = new ArrayList<HashMap<String,String>>();
		
		//����Ԫ�ض���
		HashMap<String,String> hm1 = new HashMap<String,String>();
		hm1.put("���»�", "�ַｿ");
		hm1.put("��־Ħ", "��С��");
		
		
		HashMap<String,String> hm2 = new HashMap<String,String>();
		hm2.put("��˼��", "�ֻ���");
		hm2.put("��ɽ��", "ףӢ̨");
		
		HashMap<String,String> hm3 = new HashMap<String,String>();
		hm3.put("����", "���");
		hm3.put("�Ǻ�", "����");
		
		
		array.add(hm1);
		array.add(hm2);
		array.add(hm3);
		
		for (HashMap<String, String> hashMap : array) {
			//˫�м���ת�ɵ��м���
			Set<Entry<String, String>> entrySet = hashMap.entrySet();
			
			for (Entry<String, String> entry : entrySet) {
				String key = entry.getKey();
				
				String value = entry.getValue();
				
				System.out.println(key+"---"+value);
			}
			System.out.println("---------------------");
		}
		
		System.out.println("---------�ڶ��ֱ�������----------");
		for (HashMap<String, String> hashMap : array) {
			
			Set<String> keySet = hashMap.keySet();
			
			for (String key : keySet) {
				String value = hashMap.get(key);
				
				System.out.println(key+"-----"+value);
			}
			System.out.println("-------------------------");
	
		}
		
		
	}

}
